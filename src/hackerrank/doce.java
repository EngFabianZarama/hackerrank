package hackerrank;

public class doce {
	
	public static char calculate(int[] testScores){
		int values = testScores.length;
        int score=0;
        for(int i=0;i<values;i++){
            score+=testScores[i];
        }
        double ave = score/values;
        
        if(ave>=90 && ave<=100){
            return 'O';
        }
        
        if(ave>=80 && ave<90){
            return 'E';
        }
        
        if(ave>=70 && ave<80){
            return 'A';
        }
        
        if(ave>=55 && ave<70){
            return 'P';
        }
        
        if(ave>=40 && ave<55){
            return 'D';
        }
        
        if(ave<40){
            return 'T';
        }
        return 'Z';
    
	}
	
	public static void main(String[] args){
		int[] testScores = {100,80};
		
		System.out.println(calculate(testScores));
	}
}
