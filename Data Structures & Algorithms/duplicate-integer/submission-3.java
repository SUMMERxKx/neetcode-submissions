class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash1 = new HashSet<>();
        for(int num:nums){
            if(hash1.contains(num)){
                return true;
            }
            hash1.add(num);
        }
        return false;
    } 
}
