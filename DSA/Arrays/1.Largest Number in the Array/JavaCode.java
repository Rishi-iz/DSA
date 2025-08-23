import java.util.*;

public class JavaCode {

// BRUTE FORCE
    public static int LargestNum( int arr[] ){
        Arrays.sort(arr);
        return arr[arr.length - 1];
        
    }
    
    // BETTER CODE

    public static int LargestNum2( int arr[] ){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    

    public static void main(String args[]){
        int arr[] = {1,23,5,4,134,23};
        System.out.println(JavaCode.LargestNum2(arr));
    }
    
}

