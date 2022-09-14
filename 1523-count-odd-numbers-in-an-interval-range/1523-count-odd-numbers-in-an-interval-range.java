class Solution {
    public int countOdds(int low, int high) {
  /*      int count =0; 
        while(low<=high){
            if(low%2 !=0){
                count++;
            }
            low++;
        }
        return count; */
        
           int totalNums = high-low+1; //counting total numbers in range
        
        if (low%2!=0    &&  high%2!=0)  return (totalNums/2)+1;
        return totalNums/2;
        
    }
}