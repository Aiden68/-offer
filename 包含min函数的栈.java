import java.util.Stack;

public class Solution {

    Stack<Integer> myStack = new Stack<>();
	Stack<Integer> getMin = new Stack<>();
	
	int minNum = Integer.MIN_VALUE;
    public void push(int node) {
        myStack.add(node);
        if(getMin.isEmpty()){
        	getMin.add(node);
        }
        else if(node <= getMin.peek()){
        	getMin.add(node);
		}
    }
    
    public void pop() {
        if(myStack.peek() == getMin.peek()){
        	getMin.pop();
        }
        myStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int min() {
        return getMin.peek();
    }
}