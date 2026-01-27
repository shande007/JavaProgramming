package Array_Single;

import java.sql.Array;
import java.util.Arrays;

public class Prog56_MinArray {
    public static void main() {
        int arr[] = {10, 25, 64 ,20, 5, 96, 13,55, 32};
        int min = arr[0];
        int pos = 0;

//        Arrays.sort(arr); // 5,10,13,20,25,32,55,64,96
//        System.out.println(arr[0]);


        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] < min){
                min = arr[i];
                pos = i+1;
            }
        }
        System.out.println("Minimum from given array is "+ min+" and found at position "+ pos);
    }
}
