class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> contains = new HashSet<>();
       for(int num : nums){
        if(contains.contains(num)){
            return true;
        }
        else{
            contains.add(num);
        }
        
       }
       return false; 
    }
}