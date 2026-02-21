
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Stack <Integer> st = new Stack<>();
		st.push(1);
	    st.push(2);
	    st.push(3);
	Stack <Integer> st1= new Stack<>();
	for(int i= st.size()-1;i>=0;i--){
	    st1.push(st.pop());
	    
	}
	for(int j:st1){
	   System.out.print(j);
	}
	

	}
}
