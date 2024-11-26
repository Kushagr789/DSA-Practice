class StockSpanner {
    int count=-1;
    Stack<Integer> st=new Stack<>();
    ArrayList<Integer> list=new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        while(!st.empty()&& list.get(st.peek())<=price)
            st.pop();
        count++;
        int ans=count+1;
        if(!st.empty())
            ans=count-st.peek();
        list.add(price);
        st.push(count);

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */