class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        
        for(int i = 0; i <nums.length; i++){
            int seen = target - nums[i];

            if(sum.containsKey(seen)){
                return new int[]{sum.get(seen), i};
            }
            sum.put(nums[i], i);
        }
        return new int[]{};
    }
}
