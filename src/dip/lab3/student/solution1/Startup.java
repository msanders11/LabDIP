/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Mike
 */
public class Startup {
    
    public static void main(String[] args) {
        
        MessageInputSource input = new KeyboardInput();
        MessageOutputSource output = new GUIOutput();
        
        MessagingService messagingService = new MessagingService(input, output);
        messagingService.produceMessage();
        
        
        System.out.println("Program Ended");
    }
}
