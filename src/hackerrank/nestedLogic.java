package hackerrank;

import java.util.Scanner;

public class nestedLogic {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int Da = in.nextInt();
        int Ma = in.nextInt();
        int Ya = in.nextInt();
        int De = in.nextInt();
        int Me = in.nextInt();
        int Ye = in.nextInt();
        int total=0;
        if(Ya>Ye){
            total = 10000;
            if(Ma>Me){
                total = (Ma - Me)*500; 
            }
            if(Da>De){
                total = (Da - De)*15;  
            }
        }else if(Ma>Me && Ya==Ye){
            total = (Ma - Me)*500; 
        }else if(Da>De && Ma==Me && Ya==Ye){
            total = (Da - De)*15;
        }
        if(Ya>Ye){
            total = 10000;
        }
        
        
        
       System.out.println(total);
    }
}
