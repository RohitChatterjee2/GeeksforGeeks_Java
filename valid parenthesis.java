import java.util.*;

class Main {
    public static void main(String[] args) {

        String str = "[]{}()";
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            // If opening bracket → push
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            }

            // If closing bracket
            else {

                if (st.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char temp = st.peek();

                // Correct matching
                if ((ch == '}' && temp == '{') ||
                    (ch == ')' && temp == '(') ||
                    (ch == ']' && temp == '[')) {

                    st.pop();
                } 
                else {
                    System.out.println("false");
                    return;
                }
            }
        }

        // Check at end
        System.out.println(st.isEmpty());
    }
}
