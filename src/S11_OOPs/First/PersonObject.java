package S11_OOPs.First;

public class PersonObject {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Sidhant";
        System.out.println(p1.name);

        Person p2 = new Person();
        p2.name = "Rutuja";
        System.out.println(p2.name);

        Person p3;      // only reference is created.. we can not call it or use it anywhere

        new Person();  // here object is created on heap with null name or no name as reference is not mentioned, here p3 is not aligned with it. its a tricky question will come from interviewer
    }
}
