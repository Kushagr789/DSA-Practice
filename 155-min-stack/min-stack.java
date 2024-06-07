class Pair{
    int x,y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class MinStack {
    Stack<Pair> s;

    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(s.empty())min=val;
        else{
            min=Math.min(s.peek().y,val);
        }
        s.push(new Pair(val,min));
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().x;
    }
    
    public int getMin() {
        return s.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */