class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] deg=new int[n];
        Set<String> set=new HashSet<>();
        for(int[]road:roads){
            int a=road[0],b=road[1];
            deg[a]++;
            deg[b]++;
            set.add(a+","+b);
            set.add(b+","+a);
        }
        int maxRank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int rank=deg[i]+deg[j];
                if(set.contains(i+","+j)){
                    rank--;
                }
                maxRank=Math.max(maxRank,rank);
            }
        }
        return maxRank;
    }
}