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
public class Water {
    private double level;
    private double waterTemp;//water tempreture
    private double capacity;

    public Water(double level, double waterTemp, double capacity) {
        this.level = level;
        this.waterTemp = waterTemp;
        this.capacity = capacity;
    }
    public double getLevel() {
        return level;
    }
    public void setLevel(double level) {
        this.level = level;
    }
    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;   
    }
    public String getInfo(){
        return "The machine contains : " + this.level+"milliliters of water "; 
    }
    public void booling(){
    this.waterTemp=100;
} 
    public void fillWater (){
        this.level = this.capacity;
    }
    public void addWater (int quantity ) {
        try {
        if ((this.level + quantity) > this.capacity)
            throw new QuantityOutOfCapacity();
        else 
            this.level += quantity;
        }
        catch(QuantityOutOfCapacity e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
           // System.out.println(e.getMessage());
        }
        
    }
    public boolean  checkWater (){
        try {
            if (this.getLevel()<30){
                
                throw new OutOfWaterException();}
          
        }
        catch(OutOfWaterException out )
        {
            JOptionPane.showMessageDialog(null, out.getMessage());
            //System.out.println(out.getMessage());
            return false ;
        }
        return true ;
          
    }
    public void getWaterqauntity  (int i){
        try{
        if ((this.level - i) <0)
            throw new OutOfWaterException();
        else
        this.setLevel(this.level-i);}
        catch ( OutOfWaterException out ){
            JOptionPane.showMessageDialog(null, out.getMessage());
        //System.out.println(out.getMessage());
        }
    }
}
