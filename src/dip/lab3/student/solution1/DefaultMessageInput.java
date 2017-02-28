/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class DefaultMessageInput implements MessageInputSource {

    
    private String[] defaultMessages = {"Hello World.", "Hello Java", "Hello"};
    
    @Override
    public final String getInput() {
        String message;
        Random messageIndex = new Random();
        int randomIndex = messageIndex.nextInt(defaultMessages.length);
        message = defaultMessages[randomIndex];

        return message;
    }

}
