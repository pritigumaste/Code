class Solution:
    def mySqrt(self, x: int) -> int:
        low =2
        high = x//2
        if x<2:
            return x
        while(low<=high):
            mid = (low+high)//2
            
            if(mid * mid <x):
                low=mid+1
            elif(mid * mid >x):
                high = mid-1
            elif(mid*mid ==x):
                return mid
        return high
            