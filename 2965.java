class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            int val=map.getOrDefault(i,0);
            if(val>1){
                list.add(i);
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            int val=map.getOrDefault(i,0);
            if(val==0){
                list.add(i);
            }
        }


        int resultarr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            resultarr[i]=list.get(i);
        }
        return resultarr;
    }
}