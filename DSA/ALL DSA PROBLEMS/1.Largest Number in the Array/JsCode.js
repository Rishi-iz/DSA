function LargestNum( arr ){
    arr.sort( (a,b) => a-b);
    return arr[arr.length - 1];
}

function LargestNum2( arr ){
    let largest = arr[0];
    for( let i = 1 ; i < arr.length ; i++ ){
        if(arr[i] > arr[i-1]){
            largest = arr[i];
        }
    }
    return largest;
}

function LargestNum3( arr ){
    return Math.max(...arr)
}

const arr = [1,2,34,54,64,23]
console.log(LargestNum3(arr));