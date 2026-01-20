package com.task1;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		int roundswon=0;
		char playAgain;
		
		
		
		do {
			
			int number=rand.nextInt(100) +1;
			int attempts =5;
			boolean guessedCorrectely=false;
			
			System.out.println("\nGuess the number between 1 and 100");
			
			System.out.println("You Have " + attempts + "attempts");
			
			while(attempts >0) {
				
				System.out.println("Enter Your guess:");
				int guess=sc.nextInt();
				
				
				if(guess==number) {
					System.out.println("Correct ! You Guessed the Number.");
					guessedCorrectely=true;
					roundswon++;
					break;
				}
				else if(guess > number) {
					System.out.println("Too High !");
				}
				
				else {
					System.out.println("Too Low!");
				}
				
				attempts--;
				System.out.println("Remaining attempts:" + attempts);
			}
			
			if(!guessedCorrectely) {
				
				System.out.println("You lost ! The Number was:"+number);
			}
			System.out.println("Do you want to play again (y/n):");
			 playAgain =sc.next().charAt(0);
		}
		while(playAgain == 'y' || playAgain =='Y'); {
			
			System.out.println(" \n Game Over");
			System.out.println("Total rounds Won:" +roundswon);
			
			
			
		}
		
	}
}
