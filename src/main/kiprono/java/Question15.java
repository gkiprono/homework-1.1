package main.kiprono.java;
import java.util.Arrays;


/* Core Java Basic
 * Basic Assignment 1 Q 15
 * Author: Gabriel Kiprono
 * 
 * */


public class Question15 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 5, 67, -10, -55, 12 };
		int secondLargest = SecondLargest(arr);
        System.out.println("Second largest number is: " + secondLargest);		
	}
	
	
	
	public static int SecondLargest(int[] a){
		// sort in ascending order then access the second last element
        Arrays.sort(a);
        return a[a.length - 2];
    }
}
