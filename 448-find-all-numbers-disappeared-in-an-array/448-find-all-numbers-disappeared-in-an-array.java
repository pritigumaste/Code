class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        //first traversal
        for(int i=0; i< nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx]>0){
                nums[idx] = nums[idx] * -1;
            }
        }
        
        //second traversal
        for(int i=0; i< nums.length; i++){
            if(nums[i] >0){
                result.add(i+1);
            }else{
                nums[i] = nums[i] * -1;
            }
        }
    return result;
    }
}