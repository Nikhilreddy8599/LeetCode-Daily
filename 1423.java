class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftmax=0;
        int rightmax=0;
        int sum=0;
        for(int i=0;i<=k-1;i++){
            leftmax=leftmax+cardPoints[i];
        }

        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum=Math.max(sum,leftmax+rightmax);
            leftmax=leftmax-cardPoints[i];
            rightmax=rightmax+cardPoints[right];
            right=right-1;

            sum=Math.max(sum,leftmax+rightmax);
        }
        return sum;

    }
} 