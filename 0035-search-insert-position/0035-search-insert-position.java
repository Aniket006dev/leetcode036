class Solution {
    public int searchInsert(int[] nums, int target) {
        // int idx=0; 
        int l=0;
        int en=nums.length-1;
        while(l<=en){
            int mid=l+(en-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                // idx=mid+1;
                l=mid+1;
            }
            else{
                // idx=mid-1;
                en=mid-1;
            }
        }
        return l;
    }
}