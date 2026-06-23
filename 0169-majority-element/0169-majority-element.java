class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        int maxCount=Integer.MIN_VALUE;
        int majEle=nums[0];
        int idx=0;
        for(int i=1;i<n; i++){
            idx=i;
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                if(maxCount<count){
                   maxCount=count;
                   majEle=nums[idx-1];
                }
                count=1;
            }
        }
        if(maxCount<count){
            maxCount=count;
            majEle=(n==1)?majEle:nums[idx-1];
        }

        return majEle;
    }
}