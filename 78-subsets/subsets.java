class Solution {
    public static void rec(int ind, List<List<Integer>> arr, List<Integer> temp,int nums[],int n){
        if(ind>=n)
        {
            arr.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[ind]);
        rec(ind+1,arr, temp,nums,n);
        temp.remove(temp.size()-1);
        rec(ind+1,arr, temp,nums,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        rec(0,arr,new ArrayList<>(),nums,nums.length);
        return arr;
    }
}