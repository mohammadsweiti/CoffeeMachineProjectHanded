/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author ttc
 */
public class QuantityOutOfCapacity extends Exception {

    public QuantityOutOfCapacity() {
        super ("the quantity greater than capacity ");
    }

    public QuantityOutOfCapacity(String message) {
        super(message);
    }
    
}

