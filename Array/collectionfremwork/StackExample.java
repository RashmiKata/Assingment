package collectionFremwork;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//FILO
				Stack<Integer> stack = new Stack<Integer>();
				//push
				stack.push(12);//1
				stack.push(13);//2
				stack.push(52);//3
				stack.push(82);//4
				stack.push(18);//5
				
				System.out.println("In stack after inserting element: "+stack+"\n");
				
				//pop  REMOVE LAST ELEMENT INSERTED
				int el = stack.pop();
				System.out.println("In stack after removing top element : "+el+"\n");
				System.out.println("In stack: "+stack+"\n");
			
				//peek reurn top elemny
				int re = stack.peek();
				System.out.println("In stack top element(peek): "+re+"\n");
				
				//search
				int indx = stack.search(82);
				System.out.println("In stack search on top: "+indx+"\n");
			
	}

}
/*
output
In stack after inserting element: [12, 13, 52, 82, 18]

In stack after removing top element : 18

In stack: [12, 13, 52, 82]

In stack top element(peek): 82

In stack search on top: 1
*/