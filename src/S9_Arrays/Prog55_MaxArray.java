package S9_Arrays;

public class Prog55_MaxArray {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        Arrays.sort(array); // 14,15,18,25,29,36,49,56,77
//        System.out.println(array[array.length-1]);

        int max = array[0];
        int pos = 0;
        for(int i = 0 ; i < array.length; i++)
        {
            if(array[i] > max){
                max = array[i];
                pos = i+1;
            }
        }
        System.out.println("Minimum from given array is "+ max+" and found at position "+ pos);

       }
}
