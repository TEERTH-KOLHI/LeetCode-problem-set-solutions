class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
                if(sum % k == 0){
                    return true;
                }
            }
            sum = 0;
        }
        return false;
    }
}
