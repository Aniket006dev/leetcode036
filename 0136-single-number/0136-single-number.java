class Solution {
    public int singleNumber(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int sum=nums[0];
    for(int i=1; i<n; i++){
        if(nums[i]==nums[i-1]){
            nums[i]=0-nums[i];
        }
        sum=nums[i]+sum;
      }
      return sum;
    }
}