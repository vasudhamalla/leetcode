class MyQueue {
    Stack<Integer> s1;
    public MyQueue() {
        s1 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int i=s1.removeFirst();
        return i;
    }
    
    public int peek() {
        int i = s1.getFirst();
        return i;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */