class Solution {
    public static void rec(List<List<Integer>> ans,int k, int n, int[] arr, int ind,List<Integer> temp){
        if(n==0&&temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<9;i++)
        {
            if(i>n)break;
            temp.add(arr[i]);
            rec(ans,k,n-arr[i],arr,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        rec(ans,k,n,arr,0,new ArrayList<>());
        return ans;
    }

}