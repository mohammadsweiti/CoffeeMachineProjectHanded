/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

import javax.swing.JOptionPane;

/**
 *
 * @author ttc
 */
public class WasteTray {
    private double  capacity ;
    private double  level ;

    public WasteTray() {
        this.level = 0;
    }

    public WasteTray(double capacity, double  level) {
        this.capacity = capacity;
        this.level = level;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double  getLevel() {
        return level;
    }

    public void setLevel(double  level) {
        this.level = level;
    }
    public boolean addWaste(int quantity  )
    {
       
      try {
      if ((quantity+this.level) >this.capacity)
          throw  new FullWasteException();
      else
          this.level+=quantity;
    }
        catch(FullWasteException e )
        {
             this.level+=quantity;
            JOptionPane.showMessageDialog(null, e.getMessage());
           // System.out.println(e.getMessage());
           return false;
                   
        }
      return true ;
    }
          
    public void clear()
    {
        this.level = 0 ;
    }
    public boolean checkWaste()
     {
       
         try{
         if (this.level>= this.capacity )
         {
             throw  new FullWasteException();}
         
         }
         catch(FullWasteException e)
         {
             JOptionPane.showMessageDialog(null , e.getMessage());
              //System.out.println(e.getMessage());
              return false;
         }
        return true ;
    }
    public String getInfo()
    {
        return "the machine contain "+this.getLevel()+" waste ";
    }
    
}
