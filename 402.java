class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char digit=num.charAt(i);
            while(!st.isEmpty()&&k>0&&st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k>0&&!st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0'){
            i++;
        }
        String result=sb.substring(i);
        return result.length()==0?"0":result;
    }
}