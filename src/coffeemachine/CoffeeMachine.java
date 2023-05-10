/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ttc
 */
public class CoffeeMachine {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in );
    CoffeeMachineParent p1 = new CoffeeMachineParent(new Water(0,100,3000),new CoffeeBeans(new Arabica(0, 1000),new Robusta(0, 1000)) , new Glinder(0), new WasteTray(100,0));
    p1.turnOnMachine();
    p1.getBeans().fillCoffee();
    p1.getWater().fillWater();
    String menu = "1.Espresso\n2.Americano";
    String menu2 = " 1.short \n2.double ";
     int type;
     int size1;
        do {            
            System.out.println(menu);
            System.out.println("enter your choice as number ");
            try{
             type = scan.nextInt();
            
            
            
            
            System.out.println(menu2);
        
             size1 = scan.nextInt();
             p1.makeCoffee(type, size1, 1);
            }
        catch( InputMismatchException e ){
                 System.out.println("mismatch input ");
                 scan.nextLine();
         }
        
        
        
    }while(true);
    }
}

