package Stacks;
import java.util.Scanner;

public class MyStackTest {

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		MyStack st = new MyStack();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter a String");
			st.add(scan.next());
			
		}
		
		System.out.print(st.printReverse());
	scan.close();
	}

}
