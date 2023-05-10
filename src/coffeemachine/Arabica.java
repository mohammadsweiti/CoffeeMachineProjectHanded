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
public class Arabica extends GreatBeans{

    public Arabica(double existingQuantity, double capacity) {
        super(existingQuantity, capacity);
    }

    @Override
    public void fillBeans() {
       this.existingQuantity = capacity;
     
    }

    @Override
    public String getInfo(){
        return  "the existing quantity of arabica beans is " +this.existingQuantity+" while it capacity is "+this.capacity; 
    }
    @Override
    public void addBeans(double quantity ) {
        try {
        if(quantity+this.existingQuantity > this.capacity)
            throw new QuantityOutOfCapacity();
        else 
            this.existingQuantity+= quantity;
        }
        catch(QuantityOutOfCapacity q) {
            JOptionPane.showMessageDialog(null, q.getMessage());
         //   System.out.println(q.getMessage());
        }
    } 
    
}
