class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
          int num = nums[i];
            int diff = target - num;

            if(map1.containsKey(diff)){
                return new int[]{ map1.get(diff), i};
            }
            else{
                map1.put(num, i);
            }
        }
        return new int[]{};
    }
}
