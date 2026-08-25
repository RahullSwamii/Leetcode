class Solution {
    public boolean containsDuplicate(int[] nums) {

      Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            sets.add(nums[i]);
        }
        int n= nums.length;// array length
        int a = sets.size();// set length
        
        return(n!=a);
    }
}

