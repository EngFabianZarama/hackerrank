package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Dictionary datatype
public class ocho {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // Declare a String to String map
        Map<String, Integer> phoneBook; 

        // Initialize it as a new String to String HashMap
        phoneBook = new HashMap<String, Integer>();  
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
            	System.out.println(s+"="+phoneBook.get(s));
            }else{
            	System.out.println("Not found");
            }
        }
        in.close();
		
	}
}
