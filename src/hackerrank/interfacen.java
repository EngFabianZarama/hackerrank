package hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic{
	   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic{
    
    public int divisorSum(int n){
        int sum=0;
        int a=n;
        do{
        if(a%n==0){
            sum+=n;
        }
        n--;
        }while(n>0);
        return sum;
    }
    
}
public class interfacen {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
