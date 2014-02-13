package edu.macalester.comp124;

import acm.program.ConsoleProgram;

import java.util.Random;

public class GuessNumber extends ConsoleProgram {
    private final Random rand = new Random();

    public void run(){

        while(true){
            game();
            String again = readLine("Would you like to play again?(true or false)");
            if(again.equals("false")){
             break;

        }
    }
    }


    private void game(){
        int answer = rand.nextInt(100);
    println("I'm thinking of a number between 0 and 99");

        while(true){

        int user = readInt("Your guess : ");

        if(user < answer){
            println("Higher.");
        }
        else if(user > answer){
            println("Lower");
        }
        else if(user == answer){
            break;
        }

    }
        println("You Got It!");
        // TODO: Replace this with your code to make the user guess the answer
        println("The answer is " + answer);
    }
}







