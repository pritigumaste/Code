class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n= nums.length; 
        
        //checking if array is empty
        if(nums.length==0 ||nums== null) return new int[] {-1,-1};
        
        //checking range of array if greater than target
        if(nums[0] > target || nums[n-1] < target)   return new int[] {-1,-1};
                                    
        //binary search to get the first element 
        int firstElementIdx = binarySearchFirst(nums, target);
                        
        //checking if firstelement is not found then return -1,-1
        if(firstElementIdx == -1) return new int[] {-1,-1};
                                    
        //finding the last occurence of the element by doing binary search on the 
        //second part of array after the first elements occurence
        int lastElementIdx = binarySearchLast(nums, firstElementIdx, n-1, target);
        
        return new int[] {firstElementIdx, lastElementIdx};
        }
        
    public int binarySearchFirst(int [] nums, int target){
        int low=0; 
        int high = nums.length -1; 

        
        while(low<=high){
              int  mid = low + (high-low) / 2;
                if(nums[mid] == target){
                    if(mid ==0 || nums[mid] > nums[mid-1]){
                        return mid; 
                    }else {
                        high = mid-1; 
                    }
                }
                else if(nums[mid] < target){
                    low = mid+1; 
                }else {
                    high = mid-1; 
                }
        }
        return -1; 
        
    }
                                    
    public  int binarySearchLast(int [] nums, int low , int high, int target){
       
        ; 
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(nums[mid] == target){
                if(mid == nums.length -1 || nums[mid] < nums[mid+1]){
                    return mid;
                 }else {
                    low= mid+1; 
                }
            }else if(nums[mid] < target){
                low = mid+1; 
            }else {
                 high=mid-1;
            }
        }
        return -1; 
        
    }
}
