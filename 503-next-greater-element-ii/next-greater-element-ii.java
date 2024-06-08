class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int []ans=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length*2;i++)
        {
            
            while(!st.isEmpty()&&nums[st.peek()]<nums[i%nums.length]){
                ans[st.pop()]=nums[i%nums.length];
            }
            st.push(i%nums.length);
            
        }
        return ans;
    }
}