package Stacks;
// Cory Caswell
public class ArrayStackTest {

	public static void main(String [] args){
		
		ArrayStack<String> sta = new ArrayStack<String>(10);
					
		for(int i = 0; i < 5 ; i++){
			sta.push("Sally" + i);				
		}		
		
		System.out.println(sta.toString());
	
		System.out.println("\n" + sta.inspector(3));
		
		sta.popSome(3);
		System.out.println();
		System.out.println(sta.toString());
	}

}
