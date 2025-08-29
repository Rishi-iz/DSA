### BRUTE FORCE

### OPTIMAL
## CODE - 1

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0

        i = 1
        
        for j in range ( 1 , len(nums) ):
            if nums[j] != nums[ i-1 ] :
                nums[i] = nums[j]
                i += 1
        
        return i

## CODE - 2
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0

        i = 0
        
        for j in range ( 1 , len(nums) ):
            if nums[j] != nums[ i ] :
                i += 1
                nums[i] = nums[j]
        
        return i + 1





### TIME    → *O*(*n*)

We scan the array once (j goes from 1 to n-1).
Each comparison/swapping is O(1).

### SPACE → *O*(1)

We only use a few variables (i, j).
No extra data structures.
