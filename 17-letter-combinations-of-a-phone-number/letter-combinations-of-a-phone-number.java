class Solution {
    public static void rec(List<String> ans, HashMap<Character,String>map,String temp,int ind,String str){
        if(ind>str.length())return ;
        if(ind==str.length()){
            if(temp.equals("")==false)
            ans.add(temp);
            return ;
        }
        String s=map.get(str.charAt(ind));
        for(int i=0;i<s.length();i++){
            rec(ans,map,temp+s.charAt(i),ind+1,str);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        rec(ans,map,"",0,digits);
        return ans;
    }
}