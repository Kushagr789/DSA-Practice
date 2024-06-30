class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,maxfreq=0,maxlen=0;
        while(r<n){
            if(map.containsKey(s.charAt(r)))
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
            else
                map.put(s.charAt(r),1);
            
            maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));

            while((r-l+1)-maxfreq>k)
            {
                if(map.get(s.charAt(l))>1)
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                else
                    map.remove(s.charAt(l));
                l++;
            }


            if((r-l+1)-maxfreq<=k)
            maxlen=Math.max(maxlen,r-l+1);

            r++;
        }
        return maxlen;
    }
}