package hackerrank;

import java.util.*;

public class prime {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int tests = in.nextInt();
		int[] val = new int[tests];
		
		for(int i=0;i<tests;i++){
			val[i] = in.nextInt();
		}
		in.close();
		Prime(val);
		
	}

	private static void Prime(int[] val) {
		for(int j=0;j<val.length;j++){
			for(int i=2; i<=val[j]/i; i++){
			    if(val[j]%i==0) val[j]=1;
			}
	
			if(val[j]==1) System.out.println("Not prime");
			else System.out.println("Prime");
		}
	}
}
