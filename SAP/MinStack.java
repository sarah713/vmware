package SAP;

import java.util.Stack;

public class MinStack {
    int minEle;
    Stack<Integer> s;
    int min = Integer.MIN_VALUE;

    // Constructor
    MinStack() {
        s = new Stack<>();
    }

    /* returns min element from stack */
    int getMin() {
        // Your code here
        if (s.isEmpty()) {
            return -1;
        }
        return min;
    }

    /* returns poped element from stack */
    int pop() {
        // Your code here
        if (s.isEmpty())
            return -1;
        int curr = s.peek();
        if (s.peek() >= min) {
            s.pop();
            return curr;
        } else if (s.peek() < min) {
            int premin = min;
            min = 2 * min - s.peek();
            s.pop();
            return premin;

        }
        return -1;
    }

    /* push element x into the stack */
    void push(int x) {
        // Your code here

        if (s.isEmpty()) {
            s.push(x);
            min = x;
        } else {
            if (x < min) {
                s.push(2 * x - min);
                min = x;
            } else {
                s.push(x);
            }
        }
    }
}
