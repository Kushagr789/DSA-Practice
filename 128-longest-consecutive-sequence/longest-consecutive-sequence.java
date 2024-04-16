import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        int longest=1;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++)
        s.add(nums[i]);

        for(int it:s){
            if(!s.contains(it-1))
            {
                int c=1;
                int x=it;
                while(s.contains(x+1))
                {
                    c++;
                    x++;
                }
                longest=Math.max(longest,c);
            }
        
        }
        return longest;
    }

}