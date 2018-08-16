package hackerrank;

import java.util.Scanner;
import java.util.*;
public class diesyseis  {
	 public int power(int n, int p){
		 double result=0;
		 
	        if(n<0 || p<0){
	         throw new RuntimeException("sdfd");   
	        }else{
	        	result = Math.pow(n, p);
	        }
	        
	        
	        
	        
	        return (int) result;
	    }
	
	
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		String S = in.next();
        try{
           System.out.println(Integer.parseInt(S));
        }catch (Exception ex){
        	System.out.println("Bad String");
        
        }
		
		
		in.close();
	}
}
