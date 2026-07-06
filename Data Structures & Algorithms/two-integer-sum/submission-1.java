class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i=0;i< nums.length; i++){
            map1.put(nums[i],i);
        }
        for(int i =0; i<nums.length;i++){
            int diff = target - nums[i];
            if(map1.containsKey(diff) && map1.get(diff) !=i){
                return new int[]{i,map1.get(diff)};
            
            }
        }
        return new int[0];
    }
}
