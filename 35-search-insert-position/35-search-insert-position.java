class Solution {
    public int searchInsert(int[] nums, int target) {
   /* int low =0; int high = nums.length - 1; 
    int mid = (high + low) / 2;
    while (low<=high){
    if(nums[mid]== target) 
        return mid; 
    else if(nums[mid]>target)
        high = mid-1;
    else 
        low = mid+1; 
    }
        
    return low; 
    }*/ 
          int c = 0;
        for (int num : nums) {
            if (num < target) {
                c++;
            } else {
                break;
            }
        }
        return c;
    }
}