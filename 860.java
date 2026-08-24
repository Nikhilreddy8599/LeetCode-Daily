class Solution {
    public boolean lemonadeChange(int[] bills) {
        int curr=0;
        int five=0;
        int ten=0;
        for(curr=0;curr<bills.length;curr++){
            if(bills[curr]==5){
                five=five+1;
            }            
            if(bills[curr]==20){
                if(ten>=1 && five>=1){
                   ten=ten-1;
                   five=five-1;
                }
                else if(ten==0 && five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
            if(bills[curr]==10){
                if(five==0){
                    return false;
                }
                else{
                    five=five-1;
                }
                ten=ten+1;
            }

        }
        return true;
    }
}