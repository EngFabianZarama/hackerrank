package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dos {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double meal_cost = in.nextDouble();
	        int tip_percent = in.nextInt();
	        int tax_percent = in.nextInt();
	        
	        if(3>4){
	        	
	        }else if(3>4){
	        	
	        }
	        double tip_calculation = tip_percent*meal_cost/100;
	        double tax_calculation = meal_cost*tax_percent/100;
	        double total = meal_cost + tip_calculation + tax_calculation;
	        
	        System.out.println("The total meal cost is "+Math.round(total)+" dollars.");
	        
	        in.close();
	    }
	
}
