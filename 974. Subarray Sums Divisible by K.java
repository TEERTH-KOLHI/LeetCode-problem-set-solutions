class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int p = i; p <= j; p++){
                    sum += nums[p];
                }
                if(sum % k == 0){
                    count++;
                }
                sum = 0;
            }
        }
        return count;
    }
}
