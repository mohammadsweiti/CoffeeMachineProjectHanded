/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine;

/**
 *
 * @author ttc
 */
public class FullWasteException extends Exception{

    public FullWasteException() {
        super("the trash is full please remove it ");
    }

    public FullWasteException(String message) {
        super(message);
    }
}
