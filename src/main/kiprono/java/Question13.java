package main.kiprono.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;

/* Core Java Basic
 * Basic Assignment 1
 * Author: Gabriel Kiprono
 * 
 * */

public class Question13 {
	private static Scanner scan;
	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String input = null;
		char quit;
		int x=0;
		
		// run this block while user hasnt chosen q
		do {
			System.out.println("Enter Something: ");
			input = scan.nextLine();
			
			//parse the input
			try{
				x = Integer.valueOf(input);
				
				if(x > 0) {
					// doSomething
					displaySumAndTime(x);
				}else {
					System.out.println("Error: Enter number > 0");
				}
				
			}catch (InputMismatchException ime){
				
			}catch (NumberFormatException e) {
				if(!input.equalsIgnoreCase("q")) {
					System.out.println("Enter a valid choice, Number or Q");
				}
			}
			
			// reset x
			x = 0;
			
		}while(!input.equalsIgnoreCase("q"));
		
		// quitting
		System.out.println("Program has ended");
	}
	
	public static void displaySumAndTime(int x) {
		ZoneId zid = ZoneId.systemDefault();
		ZonedDateTime datetime = ZonedDateTime.now(zid);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "uuuu.MM.dd.HH:mm:ss" );
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		
		System.out.println("Sum from 1 to " + x + " is " + sum);
		System.out.println(datetime.format(formatter));
		
	}
}
