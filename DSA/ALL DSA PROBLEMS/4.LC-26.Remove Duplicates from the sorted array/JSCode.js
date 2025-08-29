### BRUTE FORCE


### OPTIMAL
## CODE - 1 
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    if( nums.length == 0 ) return 0;
    let i = 1

    for( let j = 1 ; j < nums.length ; j++ ){
        if( nums[j] != nums[ i - 1 ] ){
            nums[i] = nums[j]
            i++
        }
    }
    return i 
};

## CODE - 2

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    if( nums.length == 0 ) return 0;
    let i = 0 

    for( let j = 1 ; j < nums.length ; j++ ){
        if( nums[i] != nums[j] ){
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
};


### TIME    → *O*(*n*)

We scan the array once (j goes from 1 to n-1).
Each comparison/swapping is O(1).

### SPACE → *O*(1)

We only use a few variables (i, j).
No extra data structures.
