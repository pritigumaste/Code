class Solution {
    public int heightChecker(int[] heights) {
        int[] arr1 = heights.clone();
        Arrays.sort(arr1);
        int count=0;
        for(int i = 0 ; i< heights.length  ; i++){
            if(heights[i] != arr1[i])
                count++;
            else
                continue; 
        }
        return count;
    }
}