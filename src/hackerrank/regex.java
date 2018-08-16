package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class regex {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String firstName;
        String emailID = null;
        ArrayList<String> arr = new ArrayList();
        
        for(int a0 = 0; a0 < N; a0++){
             firstName = in.next();
             emailID = in.next();
             if(emailID.contains("@gmail.com")){
 	        	arr.add(firstName);
 	        }
        }
        
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
        	System.out.println(arr.get(i));
        }
        
        
	        
    }
}
