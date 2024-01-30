import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
		Stack<Integer> s = new Stack<>();
		for (String S : tokens) {
			if(S.equals("+")) {
				s.push(s.pop()+s.pop());
			}
            else if(S.equals("-")) {
				b = s.pop();
				a = s.pop();
				s.push(a - b);
			}
            
			else if(S.equals("*")) {
				
                s.push(s.pop() * s.pop());
			}
			else if(S.equals("/")) {
				b = s.pop();
				a = s.pop();
				s.push(a / b);
			}
			else {
				s.push(Integer.parseInt(S));
			}
		}	
		return s.pop();
	}
}
