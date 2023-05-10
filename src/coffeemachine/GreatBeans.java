/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author ttc
 */
public abstract class  GreatBeans {// the purpose of this class is common design for coffee beans
     protected double existingQuantity;
     protected double capacity ;

    public GreatBeans(double existingQuantity, double capacity) {
        this.existingQuantity = existingQuantity;
        this.capacity = capacity;
    }

    public double getExistingQuantity() {
        return existingQuantity;
    }
    
    public void setExistingQuantity(double existingQuantity) {
        this.existingQuantity = existingQuantity;
    }
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public abstract String getInfo();
    public abstract void  fillBeans();
    public abstract  void addBeans (double i );
}