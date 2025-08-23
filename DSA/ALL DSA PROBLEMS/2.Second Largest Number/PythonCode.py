def SecLar( arr ):
    arr.sort()
    largest = max(arr)
    secLar = -1
    for i in range ( len(arr) - 1 , -1 , -1 ):
        if( arr[i] != largest ):
            secLar = arr[i]
            break
    return secLar

# TIME  -> O( N log N + N )
# SPACE -> O( 1 )


# BETTER CODE
def SecLar2( arr ):
    largest = arr[0]
    secLar = -1
    for i in range(1 , len(arr)):
        if( arr[i] > largest ):
            secLar = largest
            largest = arr[i]
        elif( arr[i] < largest and arr[i] > secLar ):
            secLar = arr[i]
    return secLar 

# TIME  -> O( N )
# SPACE -> O( 1 )

arr = [1,2,3,4,5,6,7,7]
print(SecLar(arr))
print(SecLar2(arr))
