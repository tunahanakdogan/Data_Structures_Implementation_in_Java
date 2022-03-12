import java.util.Scanner;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		 
		
		System.out.println("QUESTION 1");
		Scanner scn = new Scanner(System.in);
		String expression;
		LinkedStack ls = new LinkedStack();
		LinkedStack tempLs = new LinkedStack();
		int leftParanthesesCount = 0;
		int rightParanthesesCount = 0;
		int count = 0;
		boolean flag = true;
		Object temp;
		System.out.println("Enter the expression: ");
		while(true) {
			expression = scn.next();
			if(expression.length() < 3)
				System.out.println("Invalid Input");
			else
				break;
		}
		for (int i = 0; i < expression.length(); i++) {
			ls.push(expression.substring(i, i+1));
		}
		
		
		
		int size = ls.size();
		for (int i = 0; i < size; i++) {
		temp = ls.pop();
		
		if(temp.equals("(")) {
			rightParanthesesCount++;
			if(count==0)
				flag=false;
			count++;
			
		}		
		else if(temp.equals(")")) {
			leftParanthesesCount++;		
			count++;
		}
		tempLs.push(temp);
			
		}
		
		
		if(rightParanthesesCount != leftParanthesesCount)
			flag = false;
		
		
		
		
		
		
		size = tempLs.size();
		for (int i = 0; i < size-1; i++) {
		temp = tempLs.pop();		
		if(tempLs.peek().equals(")"))
			if(temp.equals("+") || temp.equals("-") || temp.equals("/") || temp.equals("*"))
				flag = false;		
		
		if(tempLs.peek().equals(")"))
			if(temp.equals("("))
				flag = false;				
		}
		
		
	System.out.println(flag);
	
	
	System.out.println();
	System.out.println();
	System.out.println("QUESTION 2");
	LinkedQueue lq = new LinkedQueue();
	lq.enqueue(10);
	lq.enqueue(20);
	lq.enqueue(30);
	lq.enqueue(40);
	lq.enqueue(50);
	lq.enqueue(60);
	lq.enqueue(70);	
	lq.median();
	
	LinkedQueue lq2 = new LinkedQueue();
	lq2.enqueue(10);
	lq2.enqueue(20);
	lq2.enqueue(30);
	lq2.enqueue(40);
	lq2.enqueue(50);
	lq2.enqueue(60);
	lq2.median();
	}

}
