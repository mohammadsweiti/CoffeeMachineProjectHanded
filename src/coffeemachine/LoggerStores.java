/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ttc
 */
public class LoggerStores implements logger  {
private String filePath ;
    @Override
    
    public void log(String msg) {
        try{
        FileOutputStream out = new FileOutputStream(this.getFilePath(),true);
        DataOutputStream dout = new DataOutputStream(out);
        dout.writeBytes(msg);
        dout.close();
        out.close();
        
        }
        catch(IOException e )
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public LoggerStores(String filePath) {
        this.filePath = filePath;
    }
    
    public LoggerStores() {
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    
}
