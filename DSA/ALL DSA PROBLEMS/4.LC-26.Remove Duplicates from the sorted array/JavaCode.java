###BRUTE FORCE CODE




  
### OPTIMAL CODE 
## CODE 1
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if( nums.length == 0 ) return 0;
        int i = 1 ;

        for( int j = 1 ; j < nums.length ; j++ ){
            if( nums[j] != nums[i-1] ){
                nums[i] = nums[j];
                i++;
            }
        }
        return i + 1 ;
    }
}

## CODE 2

  class Solution {
    public int removeDuplicates(int[] nums) {
        
        if( nums.length == 0 ) return 0;
        int i = 0;

        for( int j = 1 ; j < nums.length ; j++ ){
            if( nums[i] != nums[j] ){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1 ;
    }
}

## TIME AND SPACE

### TIME    → *O*(*n*)

We scan the array once (j goes from 1 to n-1).
Each comparison/swapping is O(1).

### SPACE → *O*(1)

We only use a few variables (i, j).
No extra data structures.
