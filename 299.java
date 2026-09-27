class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> sec= new HashMap<>();
        int bulls=0;
        int cows=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                sec.put(secret.charAt(i),(sec.getOrDefault(secret.charAt(i),0)+1));
            }
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls+=1;
            }
            else{
                if(sec.getOrDefault(guess.charAt(i),0)>0){
                    cows+=1;
                    sec.put(guess.charAt(i),sec.getOrDefault(guess.charAt(i),0)-1);
                }
            }
        }
        return bulls+"A"+cows+"B";

    }
}