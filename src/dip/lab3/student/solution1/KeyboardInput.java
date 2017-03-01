/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class KeyboardInput implements MessageInputSource {

    @Override
    public final String getInput() {
        String message;

        System.out.println("Please enter a message: ");

        Scanner input = new Scanner(System.in);
        message = input.nextLine();
        
        if(message == null || message.equals("") || message.length() < 2){
            throw new IllegalArgumentException("Please enter a message.");
        }
        return message;
    }
    
}
