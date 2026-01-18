package Array_Single;

public class Prog51_SecondMax {
    public static void main() {

        int arr [] = {3, 35, 30, 25, 35, 2, 11};

        int max = 0;
        int secondMax = 0;

        if(arr.length < 2) {
            System.out.println("Array length is less than 2 there is only one element to compare");
            return;
        }
        if(arr[0] > arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        }
        else
        {
            max = arr[1];
            secondMax = arr[0];
        }

        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i] > max)    // checking max
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max)    // checking second max
            {
                secondMax = arr[i];
            }
        }
        System.out.println("Second max is "+secondMax);
    }
}
