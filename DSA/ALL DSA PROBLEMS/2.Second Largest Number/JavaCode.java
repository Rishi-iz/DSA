import java.util.*;

class JavaCode {
    
    // BRUTE FORCE
    public static int SecLar( int arr[] ){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int secLar = -1;
        for(int i = arr.length - 1 ; i > 0 ; i--){
            if( arr[i] != max ){
                secLar = arr[i];
                break;
            }
        }
        return secLar;
    }

// TIME  -> O( N log N + N )
// SPACE -> O( 1 )


    // BETTER CODE
    public static int SecLar2( int arr[] ){
        int largest = arr[0];
        int secLar = Integer.MIN_VALUE;

        for( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] > largest ){
                secLar = largest;
                largest = arr[i];
            }
            else if( arr[i] < largest && arr[i] > secLar){
                secLar = arr[i];
            }
        }
        return secLar;
    }

// TIME  -> O( N )
// SPACE -> O( 1 )

    // MAIN 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,6,6,6};
        System.out.println(JavaCode.SecLar(arr));
        System.out.println(JavaCode.SecLar2(arr));
    }
}
