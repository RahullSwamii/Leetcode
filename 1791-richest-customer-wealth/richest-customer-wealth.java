class Solution {
    public int maximumWealth(int[][] accounts) {
       int max = 0;
        
        for(int i=0;i<accounts.length;i++){
            int s =0;
            for(int j :accounts[i]){
                s=s+j;
            }
            if(s>max){
                max=s;
            }
       }
       return max;
    }
}