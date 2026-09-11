class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(String op: operations){
            if(op.equals("+")){
                int top=stack.pop();
                int newt=top+stack.peek();
                stack.push(top);
                stack.push(newt);
            }
            else if(op.equals("D")){
                stack.push(2*stack.peek());

            }else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }

        }
        for(int score:stack){
            res+=score;
        }
        return res;
    }
}