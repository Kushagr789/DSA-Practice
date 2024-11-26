class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(k==0)
                st.push(ch);
            else{
                if(st.empty()){
                    st.push(ch);
                }
                else{
                    while(!st.empty()&&st.peek()>ch && k>0){
                        st.pop();
                        k--;
                    }
                    st.push(ch);
                }
            }
        }

        while(k>0){
            if(!st.empty()){
                st.pop();
                k--;
            }
            else
                break;
        }

        if(st.empty()) return "0";
        StringBuilder sb=new StringBuilder();
        boolean zero=true;
        for(Character c: st){
            if(sb.length()==0&&c=='0') continue;
            sb.append(c);
        }
        if(sb.toString().equals("")) return "0";

        return sb.toString();
    }
}