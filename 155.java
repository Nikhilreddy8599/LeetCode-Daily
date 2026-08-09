class MinStack {
    Stack<Integer> stac;
    Stack<Integer> min;
    public MinStack() {
        stac= new Stack<>();
        min=new Stack<>();
    }
    public void push(int value) {
        stac.push(value);
        if(min.isEmpty()||value<=min.peek()){
            min.push(value);
        }
    }
    
    public void pop() {
        int temp=stac.pop();
        if(min.peek()==temp){
            min.pop();
        }
    }
    
    public int top() {
        return stac.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */