import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack = new Stack<>();
		int j = 0;
		for(int i = 0; i < pushA.length; i++){
			stack.add(pushA[i]);
			while(!stack.isEmpty() && stack.peek() == popA[j]){
				stack.pop();
				j++;
			}
		}
		if(stack.size() == 0){
			return true;
		}
		return false;  
    }
}