class MinStack {
    Stack<Integer>st;
    Stack<Integer>min_st;

    public MinStack() {
        st = new Stack<>();
        min_st = new Stack<>(); 
    }
    
    public void push(int val) {
        st.push(val);
        if(min_st.isEmpty() || val<=min_st.peek()){
            min_st.push(val);
        }
    }
    
    public void pop() {
       int pop_val = st.pop();
       if(pop_val==min_st.peek()){
        min_st.pop();
       }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min_st.peek();
    }
}
