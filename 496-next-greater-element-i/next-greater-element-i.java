class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!st.empty()&&st.peek()<=nums2[i])
            st.pop();
            if(!st.empty())
            map.put(nums2[i],st.peek());
            else
            map.put(nums2[i],-1);

            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        nums1[i]=map.get(nums1[i]);
        return nums1;
    }
}