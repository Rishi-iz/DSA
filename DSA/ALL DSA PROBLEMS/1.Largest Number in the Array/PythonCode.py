# // BRUTE FORCE

def LargestNum(arr):
    arr.sort()
    return arr[-1]

# BETTER CODE

def LargestNum3(arr):
    largest = arr[0]
    for i in range ( 1 , len(arr)):
        if arr[i] > largest:
            largest = arr[i]
    return largest

# OPTIMAL CODE
def LargestNum3(arr):
    return max(arr)


arr = [1,2,45,23,12,543]
print(LargestNum2(arr))
