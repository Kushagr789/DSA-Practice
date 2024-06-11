class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.empty())
            left[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.empty())
            right[i]=st.peek();
            st.push(i);
        }
        int mod=(int) 1e9 +7;
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(long)(i-left[i])*(right[i]-i)%mod*arr[i];
            ans%=mod;
        }
        return (int)ans;
    }
}