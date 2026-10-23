class Solution {
    public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while(l <= r ){
        int mid = l + ( r - l)/2;

        //check if mid is target
        if(target == nums[mid]){
            return mid;
        }
        //if left half is sorted
        if(nums[l] <= nums[mid]){
            //check if target is in the sorted half
            if(target < nums[l] || target > nums[mid]){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        //right half is sorted
        else{
            if(target < nums[mid] || target > nums[r]){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
    }
     return -1;   
    }
}
