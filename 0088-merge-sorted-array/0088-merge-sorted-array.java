class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1len = nums1.length;
        
        int fast =nums1len -1;
        int p1 = m-1;
        int p2 = n-1;
        
        while(p1>=0 && p2>=0){
                
            if(nums1[p1] <= nums2[p2]){
                nums1[fast] = nums2[p2];
                p2--;
                fast--;
            }
            else {
                nums1[fast] = nums1[p1];
                p1--;
                fast--;
            }
       }
        while(p2>=0){
            nums1[fast] = nums2[p2];
                p2--;
                fast--;
        }
    }
}