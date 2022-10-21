class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero =0; 
        int n= nums.length;
        for (int i = 0; i<n;i++)
        {
            if(nums[i] != 0){
                nums[lastNonZero++] = nums[i];
            }
        }
        
        for(int i = lastNonZero; i<n;i++){
            nums[i]=0;
        }
        
        
    }
}
