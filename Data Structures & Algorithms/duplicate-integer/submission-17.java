class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for(int n: nums){
           if(duplicate.contains(n)){
            return true;
           }
           else{
            duplicate.add(n);
           }
        }
        return false;

        
    }
}