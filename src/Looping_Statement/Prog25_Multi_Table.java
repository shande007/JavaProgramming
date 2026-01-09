package Looping_Statement;

public class Prog25_Multi_Table {
    public static void main(String[] args) {

        int num = 5, res = 0;
        for(int i = 1; i<=10; i++)
        {
//            System.out.println(num + " x " + i + " = " +(num*i));
            res = num*i;
            System.out.println(num + " x " + i + " = " +res);
        }
    }
}
