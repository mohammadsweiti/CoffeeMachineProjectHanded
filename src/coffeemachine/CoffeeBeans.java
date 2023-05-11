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
public class CoffeeBeans {
    private Arabica arabic;
    private Robusta roubusta;

    public CoffeeBeans(Arabica arabic, Robusta roubusta) {
        this.arabic = arabic;
        this.roubusta = roubusta;
    }

    public Arabica getArabic() {
        return arabic;
    }

    public void setArabic(Arabica arabic) {
        this.arabic = arabic;
    }

    public Robusta getRoubusta() {
        return roubusta;
    }

    public void setRoubusta(Robusta roubusta) {
        this.roubusta = roubusta;
    }
    public  void fillCoffee(){
        this.getArabic().fillBeans();
        this.getRoubusta().fillBeans();
    }
    public void addCoffee(int quantity )
    {
        this.getArabic().addBeans(quantity/2.0);
        this.getRoubusta().addBeans(quantity/2.0);
    }
    public String getInfo(){
        return " "+this.arabic.getInfo() + ""+this.roubusta.getInfo();
    }
    public boolean   check(double j){
        try{
        if(this.getArabic().getExistingQuantity()+this.getRoubusta().getExistingQuantity()<j)
            throw new OutOfCoffeeBeansException();
        
        
        }
        catch(OutOfCoffeeBeansException out )
        {
            JOptionPane.showMessageDialog(null , out.getMessage());
            return false;
           // System.out.println(out.getMessage());
        }
        return true ;
     
    }
    public void getGroundCoffee(double i){
        if (this.check(i)){
        this.getArabic().setExistingQuantity(this.getArabic().getExistingQuantity()-(i/2.0));
        this.getRoubusta().setExistingQuantity(this.getRoubusta().getExistingQuantity()-(i/2.0));
        }
        else 
            JOptionPane.showMessageDialog(null , "the machine is out of coffee");
    }
}
