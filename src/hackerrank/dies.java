package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class dies extends uno {
	
	public static void main (String[] args){
		Stack sk = new Stack();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cnt= 0;
		int max=0;
		int j=0;
		String xString = Integer.toBinaryString(x);
		
		
		
		
		
		
		for(int i = 0 ; i<xString.length()-1 ; i++){
			
			if(xString.charAt(i)=='1'){
				j=i;
				j++;
				cnt++;
				while(xString.charAt(j)=='1'){
					cnt++;
					j++;
					if(xString.length()==j){
						break;
					}
				}
				
				if(cnt>max){
					max = cnt;
				}
				cnt = 0;
				i=j;
			}
		
		
	}
		
		if(cnt==0){
		for(int i = 0 ; i<xString.length()-1 ; i++){
			
			if(xString.charAt(i)=='1'){
				cnt=1;
			}
		}
		}
		
		System.out.println(max);
		
		in.close();
		
	}
}
