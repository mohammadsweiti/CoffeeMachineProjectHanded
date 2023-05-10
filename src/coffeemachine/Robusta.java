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
public class Robusta extends GreatBeans {

    public Robusta(double existingQuantity, double capacity) {
        super(existingQuantity, capacity);
    }
    @Override
    public String getInfo (){
        String result=  "the existing quantity of robusta beans is " +this.existingQuantity+" while it capacity is "+this.capacity; 
        return result;
    }
    @Override
    public void fillBeans() {
       this.existingQuantity = capacity;
    }
    @Override
    public void addBeans(double quantity ) {
        try{
        if(quantity+this.existingQuantity > this.capacity)
            throw new QuantityOutOfCapacity();
        else 
            this.existingQuantity+= quantity;
        }
        catch (QuantityOutOfCapacity e){
            JOptionPane.showMessageDialog(null, e.getMessage());    
           // System.out.println(e.getMessage());
        }
    }
   
   
}
