package hackerrank;

import java.util.Scanner;

public class Linkedlist {
	
		int data;
		Linkedlist next;
		Linkedlist(int d) {
	        data = d;
	        next = null;
	    }
	
	
	
		public static  Linkedlist insert(Linkedlist head,int data) {
	        //Complete this method
			Linkedlist last = head;
	        if(head==null){
	        	head = new Linkedlist(data);
	        }else{
	        	while(last.next != null){
	        		last = last.next; 
	        	}

	        	last.next = new Linkedlist(data);
	        	
	        }
			return head;
	       
	    }
	
		
		public static void display(Linkedlist head) {
			Linkedlist start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Linkedlist head = null;
	        int N = sc.nextInt();

	        while(N-- > 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	        }
	        display(head);
	        sc.close();
	    }
	
}
