/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author ttc
 */
public class OutOfCoffeeBeansException extends Exception{

    public OutOfCoffeeBeansException() {
        super ("the machine is out of coffee Pleas put coffee ");
    }

    public OutOfCoffeeBeansException(String message) {
        super(message);
    }
}
