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
public class CoffeeMachineParent {
    private Water water;
    private CoffeeBeans beans;
    private Glinder glind;
    private  WasteTray trash;
    private logger log ;

    public logger getLog() {
        return log;
    }

    public void setLog(logger log) {
        this.log = log;
    }

    public CoffeeMachineParent(Water water, CoffeeBeans beans, Glinder glind, WasteTray trash, logger log) {
        this.water = water;
        this.beans = beans;
        this.glind = glind;
        this.trash = trash;
        this.log = log;
    }
    
    public CoffeeMachineParent() {
        water = new Water(0, 0, 3000);
        beans = new CoffeeBeans(new Arabica(0,1000), new Robusta(0,1000));
        glind = new Glinder(0);
        trash  = new WasteTray(100, 0);
        log = new LoggerStores("machinestate.txt ");
    }

    public CoffeeMachineParent(Water water, CoffeeBeans beans, Glinder glind, WasteTray trash) {
        this.water = water;
        this.beans = beans;
        this.glind = glind;
        this.trash = trash;
    }

    public WasteTray getTrash() {
        return trash;
    }

    public void setTrash(WasteTray trash) {
        this.trash = trash;
    }
   

    
   
    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public CoffeeBeans getBeans() {
        return beans;
    }

    public void setBeans(CoffeeBeans beans) {
        this.beans = beans;
    }
   

    public Glinder getGlind() {
        return glind;
    }

    public void setGlind(Glinder glind) {
        this.glind = glind;
    }
    public String getInfo(){
       return ""+ this.getWater().getInfo()+this.getBeans().getInfo()+this.getTrash().getInfo()+this.getGlind().getInfo();  
     }
    public void turnOnMachine()
    {
        
        this.getBeans().addCoffee(0);
        this.getWater().addWater(0);
        this.getTrash().clear();
        this.getGlind().setDegree(0);// defualt degree
    }
    public void calCaffineCalores(double  caf ,double calr){
       // System.out.println("this cup contain "+ caf +" mg  Caffeine  and calories " +calr);
        JOptionPane.showMessageDialog(null, "this cup contain "+ caf +" mg  Caffeine  and"+calr+" calories " );
    }
    public void makeCoffee(int  type ,int  size ,double degree  ){
        if (this.getBeans().check(7) && this.getWater().checkWater() && this.getTrash().checkWaste()){
        
        this.getGlind().setDegree(degree);
     
        if(type == 1)
        {
         if (size == 1)  
         {
            this.getBeans().getGroundCoffee(7);
               this.getGlind().glinderLevel(degree);
            this.getWater().getWaterqauntity(30);
            this.getTrash().addWaste(7);
            this.calCaffineCalores(63,2 );
         }
          else 
         {
         this.getBeans().getGroundCoffee(14);
         this.getGlind().glinderLevel(degree);
         this.getWater().getWaterqauntity(60);
         this.getTrash().addWaste(14);
         this.calCaffineCalores(125,6);
         }
         
         }
        else 
        {
            if (size == 1 )
            {
            this.getBeans().getGroundCoffee(7);
               this.getGlind().glinderLevel(degree);
            this.getWater().getWaterqauntity(170);
            this.getTrash().addWaste(7);
            this.calCaffineCalores(47,10);
            }
            else 
         {
             this.getBeans().getGroundCoffee(14);
                this.getGlind().glinderLevel(degree);
            this.getWater().getWaterqauntity(220);
            this.getTrash().addWaste(14);
            this.calCaffineCalores(94,18);
         }
        }}
   
    }
}
