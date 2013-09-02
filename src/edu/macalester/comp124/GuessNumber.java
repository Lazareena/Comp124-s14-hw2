package edu.macalester.comp124;

import acm.program.ConsoleProgram;

import java.util.Random;

public class GuessNumber extends ConsoleProgram {
    private final Random rand = new Random();
    
    public void run() {
        int answer = rand.nextInt(100);
        
        // TODO: Replace this with your code to make the user guess the answer
        println("The answer is " + answer);
    }
}
