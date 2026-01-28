package S9_Arrays;

public class Prog52_ArrayDeclaration {
    public static void main(String[] args) {

        int a = 10;
        int marks[] = {91, 90, 51, 100, 91, 92, 89};
        int[] marks2 = {91, 90, 51, 100, 91, 92, 89};

        boolean [] is_married_people = {true,true,false};
        String [] names = {"Sidhant","Rutuja","Harish"};
        // String [] names = {"Sidhant","Rutuja","Harish",31};     // Not allowed 34 is number and we are using string array

        float[] values = new float[3];
        values[0] = 3.14f;
        values[1] = 4.14f;
        values[2] = 5.14f;
//         values[3] = 5.14f;   // Array index out of bound


        for(String name: names){

            System.out.println(name);

        }

    }
}
