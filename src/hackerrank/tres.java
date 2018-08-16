package hackerrank;

import java.util.Scanner;

public class tres {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0;i<T;i++){
        	String S = scan.next();
        	String even="";
        	String odd="";
        	for(int j=0;j<S.length();j++){
        		if(j%2==0){
        			
        			even += S.charAt(j);
        		}else{
        			 odd += S.charAt(j);
        		}
        	}
        	System.out.println(even+"  "+odd);
        }
        scan.close();
       
    }
}
