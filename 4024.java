class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int mindist=Integer.MAX_VALUE;
        int ret=-1;
       for(int i=0;i<drones.length;i++){
          
               int dist=(Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]));
                   if(dist<=drones[i][2]){
                   if(dist<mindist){
                       mindist=dist;
                       ret=i;
                   }
                   }
           
       } 

        return ret; 
        
    }
}

