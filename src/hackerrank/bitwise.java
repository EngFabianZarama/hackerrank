package hackerrank;

import java.util.Scanner;

public class bitwise {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = 0;
        int k = 0;
        for(int a0 = 0; a0 < t; a0++){
             n = in.nextInt();
             k = in.nextInt();
             // n = number in the array
             // n = 5 -> {1,2,3,4,5}
             // k compared number to this to check the max
             
             int res=0;
             
             
             for(int i = 0; i<n;i++){
            	 for(int j =i+1; j<n;j++){
            			if((i & j)<k && (i & j)>res){
            				res=i&j;
            			}
            	 }
             }
             System.out.println(res);
        } 
      
       
    }
}
