class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        int []ans=new int[nums1.length];
        for(int i=0;i<nums2.length;i++)
        st.push(nums2[i]);
        for(int i=0;i<nums1.length;i++)
        {
            int gret=-1;
            while(!st.empty()&&st.peek()!=nums1[i]){
                if(st.peek()>nums1[i])
                gret=st.peek();

                temp.push(st.pop());
            }
            ans[i]=gret;
            while(!temp.empty())
            st.push(temp.pop());
            
        }
        return ans;
    }
}