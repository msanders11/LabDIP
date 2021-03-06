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
public class MessagingService {

    private MessageInputSource input;
    private MessageOutputSource output;

    public MessagingService(MessageInputSource input, MessageOutputSource output) {
        setInput(input);
        setOutput(output);
        //this.input = input;
        //this.output = output;
    }

    public final void produceMessage() {
        String line = input.getInput();
        output.outputMessage(line);
    }

    public final MessageInputSource getInput() {
        return input;
    }

    public final void setInput(MessageInputSource input) {
        if (input == null || input.equals("")) {
            throw new IllegalArgumentException("Valid input needed.");
        }
        this.input = input;
    }

    public final MessageOutputSource getOutput() {
        return output;
    }

    public final void setOutput(MessageOutputSource output) {
        if (output == null || output.equals("")) {
            throw new IllegalArgumentException("Valid output needed.");
        }
        this.output = output;
    }

}
