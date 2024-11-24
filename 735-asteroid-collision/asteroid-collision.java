class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int a=asteroids[i];
            if(a>0)
                st.push(a);
            else{
                while(!st.empty()&& st.peek()>0 &&(st.peek()<Math.abs(a)))
                    st.pop();
                if(!st.empty() && st.peek()==Math.abs(a))
                    st.pop();
                else if(st.empty()|| st.peek()<0)
                    st.push(a);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}