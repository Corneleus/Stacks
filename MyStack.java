package Stacks;
import java.util.ArrayList;

public class MyStack extends ArrayList {
	
	public MyStack(){
		super();
	}
	
	public void add(String str){
		super.add(str);
	}

	public String printReverse(){
		StringBuilder sb = new StringBuilder();
		for (int i = super.size()-1; i >=0; i--){
			sb.append(get(i) + "\n");
		
		}
		return sb.toString();
	
	}
}
