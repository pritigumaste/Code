class Solution {
    public int removeDuplicates(int[] nums) {
        //int count =0; 
       // Arrays.sort(nums);
        int j=0;
       // HashMap<Integer, Integer> finalRes = new HashMap();
        
        for (int i=0;i< nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
            
        }
        return j+1;
    }
}