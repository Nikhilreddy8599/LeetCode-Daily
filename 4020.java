class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int timetaken=requests[0];
        
        for(int i=0;i<requests.length-1;i++){
            if(requests[i]<n&&requests[i+1]<n){
            timetaken=timetaken+Math.abs(requests[i]-requests[i+1]);
            }
        }
        return timetaken;
    }
}
