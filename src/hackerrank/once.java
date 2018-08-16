package hackerrank;

import java.util.Scanner;

public class once {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int sum;
		//reading the array
		int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //array is stored in arr
        
        int max = arr[0][0] + arr[0][1] + arr [0][2] 
							+ arr[1][1]
				+ arr[2][0] + arr[2][1] + arr [2][2];
        //Comparing all the hourglasses
    
        for(int i=0;i<4;i++){ //column controll
        	for(int j=0;j<4;j++){
		        sum = arr[j][i] + arr[j][i+1] + arr [j][i+2] 
		        				+ arr[j+1][i+1]
		        	+ arr[j+2][i] + arr[j+2][i+1] + arr [j+2][i+2];
		        
		        if(sum>max){
		        	max=sum;
		        }
        	}
        }
        in.close();
        System.out.println(max);
        
	}
}
