package Stacks;
// Cory Caswell

public class LinkedStackTest {

	public static void main(String [] args){
		
		LinkedStack<String> stack = new LinkedStack<String>();
		
		for(int i = 0; i < 10 ; i++){
			stack.push("" + i);
		}
	
		System.out.println(stack.toString());
	
		System.out.println(stack.inspector(2));
	
		stack.popSome(3);
		
		System.out.println(stack.toString());
		System.out.println();
		System.out.println(stack.popTop());
		System.out.println(stack.toString());
	}
}
