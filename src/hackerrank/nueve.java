package hackerrank;

import java.util.Scanner;

public class nueve {
	
	static int factorial(int x){
		if(x==1){
			return 1;
		}
		return x * factorial(x-1);
	}
	
	public static void main (String[] args){
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int result = factorial(n);
	        System.out.println(result);
	        in.close();
	}
}
