package Array_Single;

public class Prog53_ArrayDeclaration2 {
    public static void main(String[] args) {

        int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] mark2 = new int[5];
        int mark3[] = new int[5]; // Fixed Size


        String[] names = new String[3];
        names[0] = "sidhant";
        names[1] = "rutuja";
        names[2] = "harsiih";

        System.out.println(marks[0]); //1
        System.out.println(mark2[0]); // 0

        for(String name : names)
            System.out.println(name);
    }
}
