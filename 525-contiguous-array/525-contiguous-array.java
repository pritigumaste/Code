class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //to detect the initial sub array 
        
        int sum=0; 
        int lenArr=0; 
        int max=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                sum--; 
            else 
                sum++; 
            
            if(map.containsKey(sum)){
                lenArr = i - map.get(sum);
                max = Math.max(max, lenArr);
            }else 
                map.put(sum, i);
        }
        return max; 
    }
}