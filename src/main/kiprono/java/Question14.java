package main.kiprono.java;
import java.util.Arrays;

/* Core Java Basic
 * Basic Assignment 1 Q 14
 * Author: Gabriel Kiprono
 * 
 * */



public class Question14 {

	public static void main(String[] args) {
		
		// first array
        int[] a = { 10, 20, 30, 40 };

        // second array
        int[] b = { 50, 60, 70, 80 };


        // third array
        int[] c = MergeArrays(a, b);

        //print the array
        System.out.println(Arrays.toString(c));
	}
	
	
	public static int[] MergeArrays(int[]a, int[]b){
        int[] c = new int[a.length + b.length];
        
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        return c;
    }
}
