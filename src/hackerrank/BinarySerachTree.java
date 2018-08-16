package hackerrank;

import java.util.Scanner;


public class BinarySerachTree {
	BinarySerachTree left,right;
    int data;
    BinarySerachTree(int data){
        this.data=data;
        left=right=null;
    }
	public static int getHeight(BinarySerachTree root){
			int countLeft = 0;
			int countRight = 0;
			
			if(root.left!=null){
				countLeft = getHeight(root.left) + 1;
			}
			if (root.right != null) {
				countRight = getHeight(root.right) + 1;
		    }
			
			if(countRight>countLeft){
				return countRight;
			}
			return countLeft;
		  
	    }
	
	public static BinarySerachTree insert(BinarySerachTree root,int data){
	    if(root==null){
	        return new BinarySerachTree(data);
	    }
	    else{
	    	BinarySerachTree cur;
	        if(data<=root.data){
	            cur=insert(root.left,data);
	            root.left=cur;
	        }
	        else{
	            cur=insert(root.right,data);
	            root.right=cur;
	        }
	        return root;
	    }
	}
	
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BinarySerachTree root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
