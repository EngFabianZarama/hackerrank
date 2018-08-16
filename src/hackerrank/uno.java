package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class uno {
	static int ajam;
	public int holaCareBola(int x){
		return x;
	}
	public static void main(String[] args){
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");;
        
        /* Declare second integer, double, and String variables. */
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = scan.next();
        s2 += scan.nextLine();
        
        ArrayList<Integer> arrL = new ArrayList<Integer>();

        

        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        i2 = i + i2;
        System.out.println(i2);

        /* Print the sum of the double variables on a new line. */
		d2 = d + d2;
        System.out.println(d2);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
       
        System.out.println(s2);
        scan.close();
        }
	
}
