class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length < 2){
            return;
        }
        int[] cA = new int[3];
        for(int i = 0; i < nums.length; i++){
            cA[nums[i]]++;
        }
        int x = 0;
        int y = 0;
        while(x <= 2){
            if(cA[x] != 0){
                nums[y++] = x;
                cA[x] = cA[x] - 1;
            }else{
                x++;
            }
        }
    }
}
