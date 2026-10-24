class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
          
        }
        return Math.log(n) / Math.log(4) % 1 == 0;      
    }
}