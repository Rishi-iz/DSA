function SecLar( arr ){
    arr.sort( (a,b) => a - b )
    let largest = arr[arr.length - 1]
    let secLar = -1

    for( let i = arr.length - 1 ; i > 0 ; i-- ){
        if( arr[i] != largest ){
            secLar = arr[i];
            break;
        }
    }
    return secLar
}

function SecLar2( arr ){
    let largest = arr[0]
    let secLar = -1

    for( let i = 1 ; i < arr.length ; i++ ){
        if( arr[i] > largest ){
            secLar = largest
            largest = arr[i]
        }
        else if( arr[i] < largest && arr[i] > secLar){
            secLar = arr[i]
        }
    }
    return secLar
}


const arr = [1,2,3,4,5,6,6,6,6]
console.log(SecLar(arr));
console.log(SecLar2(arr));