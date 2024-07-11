class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++)
            set.add(wordList.get(i));
        
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();

            if(word.equals(endWord)) return steps;

            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] replace=word.toCharArray();
                    replace[i]=ch;
                    String replaceWord=new String(replace);
                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        q.add(new Pair(replaceWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    int second;
    String first;
    Pair(String a, int b){
        this.first=a;
        this.second=b;
    }
}