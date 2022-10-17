class Solution {
    public int majorityElement(int[] nums) {
        
        int n= nums.length;
        int m=0;
        //int count =1;
        
        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
        
        for(int i=0; i< n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else
                map.put(nums[i], map.get(nums[i])+1);
            
            if(map.get(nums[i]) > (n/2)){
             m=  nums[i];
                break;
        
        }
           
        }
        return m;
    }
}