/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;


/**
 *
 * @author Mike
 */
public class RandomMessageInput implements MessageInputSource {

    
    private String[] defaultMessages = {"Hello World.", "Hello Java", "Hello", "Hello Programmers", "Goodbye"};
    
    @Override
    public final String getInput() {
        String message;
        Random messageIndex = new Random();
        int randomIndex = messageIndex.nextInt(defaultMessages.length);
        message = defaultMessages[randomIndex];

        return message;
    }

}
