package ten;

import java.util.Stack;

class Queue {
    Stack<Integer> s1, s2;
    int temp;
    int res;
    Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.empty())
        {
            while(!s1.empty())
            {
                s2.push(s1.pop());
            }
            res = s2.peek();
            s2.pop();
            return res;
        }
        else
        {
            res = s2.peek();
            s2.pop();
            return res;
        }
    }

    public int peek() {
        if(!s2.empty())
        {
            res = s2.peek();
            return res;
        }
        else
        {
            while(!s1.empty())
            {
                temp = s1.peek();
                s2.push(temp);
                s1.pop();
            }
            res = s2.peek();
            return res;
        }
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
public class Demo_Queue {
    public static void main(String[] args) {
        Queue n = new Queue();
        n.push(1);
        n.push(2);
        System.out.println(n.peek());
        System.out.println(n.pop());
        System.out.println(n.empty());
    }
}
