class Solution {
    public int maxArea(int[] height) {
        int rp=height.length-1;
        int area=0;
        int lp=0;
        int heigh;
        int width;
        while(lp<rp){
            heigh=Math.min(height[lp],height[rp]);
            width=rp-lp;
            area=Math.max(area,(heigh*width));
            if (height[lp]<height[rp])
                lp++;
            else 
                rp--;

        }
        return area;


    }
}