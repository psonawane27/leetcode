/*
Space complexity: O(N)
Time Complexity: O(1)
*/
import java.util.*;

public class MinStack {

    Stack<Long> minStack;
    long min;
    
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Long>();
    }
    
    public void push(int x) {
        if (minStack.isEmpty()){
            minStack.push(0L);
            min=x;
        }else{
            minStack.push(x-min);
            if (x<min) min=x;
        }
    }
    
    public void pop() {
        if (minStack.isEmpty())
			return;
        
        long pop=minStack.pop();
        
        if (pop<0)  min=min-pop;
        
    }

    public int top() {
        long top=minStack.peek();
        if (top>0){
            return (int)(top+min);
        }else{
           return (int)(min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}