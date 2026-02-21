
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String str = "Hello";
	Stack <Character> st = new Stack<>();
	

	for(int i=0;i<str.length();i++){
	    char ch = str.charAt(i);
	    st.push(ch);
	}
	    Stack <Character> st1 = new Stack<>();
	    for(int y =st.size()-1;y>=0;y--){
	        st1.push(st.pop());
	    }
	
	for(char j:st1){
	   System.out.print(j);
	}
	

	}
}
