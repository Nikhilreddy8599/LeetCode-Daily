class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list =new ArrayList();
        int max=0;
        for(int c: candies){
            if(c>max){
                max=c;
            }
        }
        for(int i=0;i<candies.length;i++){
          if(candies[i]+extraCandies>=max){
            list.add(i,true);
          }
          else{
            list.add(i,false);

          }
        
        }
        return list;
    }
}