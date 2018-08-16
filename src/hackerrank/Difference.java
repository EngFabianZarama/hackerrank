package hackerrank;

import java.util.Scanner;

public class Difference {
	private int[] elements;
  	public int maximumDifference;
  	
// Add your code here
    
  	public int n;
    Difference(int[] a){
        elements = a;
        n = a.length;
        maximumDifference = 0;
    }

    public void computeDifference(){
    	
     for(int i=0;i<n;i++){
    	 for(int j=0;j<n;j++){ 
	    	if( Math.abs(elements[i]-elements[j])>maximumDifference){
	    		maximumDifference = Math.abs(elements[i]-elements[j]);
	    	}
    	 }
     }
        
    }

    public int maximumDifference(){
        return maximumDifference;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
} // End of Difference class

 

   

