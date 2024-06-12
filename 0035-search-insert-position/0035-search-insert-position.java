class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        if(nums[0]>target){
            index= 0;
        }
        if(nums[nums.length-1]<target){
            index = nums.length;
        }
    for(int i=1; i<nums.length; i++){
        if(nums[i-1]<target&&target<=nums[i]){
            index = i;
        }
    }
    return index;
    }
}