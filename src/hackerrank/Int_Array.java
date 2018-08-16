package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Int_Array {
	
	 static int maximumDifference(int g_nodes, int[] g_from, int[] g_to) {
		 
	       for(int i=0;i<g_from.length;i++){
	           if(g_from[i]==(g_from[i+1]-1)){
	              
	           }
	       }
	       
	       return 2;
	    }

	static String findNumber(String s) {
		ArrayList<String> arrLst= new ArrayList<String>();
		String result = null;
		while(s!=null){
			if(s.indexOf(" ")==-1){
				arrLst.add(s.substring(0,s.length()-1));
				s=null;
			}else{
			arrLst.add(s.substring(0,s.indexOf(" ")));
			s = s.substring(s.indexOf(" ")+1);
			}
			
		}
		
		for(int i=0;i<arrLst.size()-1;i++){
			for(int j=i;j<arrLst.size()-1;j++){
				
				if(arrLst.get(i).equals(arrLst.get(j+1))){
					result += arrLst.get(j);
					result+=",";
				}
			}
			
		}
		
		return result;
    }
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        
        
        String s = in.nextLine();
        
       System.out.println(findNumber(s));
       
    }
}

