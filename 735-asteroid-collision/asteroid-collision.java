class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int a=asteroids[i];
            if(st.empty())
            st.push(a);
            else{
                if(a<0){
                    if(st.peek()<0)
                    st.push(a);
                    else{
                        while(!st.empty()&&st.peek()>0&&st.peek()<(-1*a))
                        st.pop();

                        if(!st.empty()){
                            if(st.peek()>0&&st.peek()==(-1*a))
                            st.pop();
                            else if(st.peek()<0)
                            st.push(a);
                        }
                        else
                        st.push(a);
                    }
                }
                else{
                    st.push(a);
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}