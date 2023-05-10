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
public class Glinder {
    private  double  degree ;

    public Glinder() {
    }

    public Glinder(double degree) {
        this.degree = degree;
    }
    
    
    public  void glinderLevel(double i )
    {
        JOptionPane.showMessageDialog(null, "the glinder is grinding coffee  in "+i+" degree ");
        //System.out.println("the glinder is grinding coffee  in "+i+" degree");
        this.setDegree(i);
    }

    public double  getDegree() {
        return degree;
    }

    public void setDegree(double  degree) {
        this.degree = degree;
    }
    
    public String getInfo ()
    {
        return "the machine is placed in  "+this.getDegree()+"degree";
    }
}

