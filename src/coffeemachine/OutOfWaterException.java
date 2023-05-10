/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author ttc
 */
public class OutOfWaterException extends  Exception {

    public OutOfWaterException() {
        super ("the machine is out of water \n please put water ");
    }

    public OutOfWaterException(String message) {
        super(message);
    }
    
    
}