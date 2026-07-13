class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(cMap.containsKey(diff)){
                return new int[]{cMap.get(diff), i};
            }
            cMap.put(num, i);
        }
        return new int[]{};
    }
}
