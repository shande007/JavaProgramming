package Self_Test_1;

public class Test13_ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 5)
                continue;
            System.out.print(i + " ");
        }
    }
}
