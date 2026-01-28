package S11_OOPs.Constructors;


import S11_OOPs.First.Person;

public class Prog72_Constructors {
    public static void main(String[] args) {
        Animal dog = new Animal();      // Constructor will call immediately once object is created
        MySQL a = new MySQL();         // Constructor will call immediately once object is created
        ReadExcelFile e = new ReadExcelFile();      // Constructor will call immediately once object is created
        // we can call any constructor which is withing same package.
    }
}
class MySQL {
    MySQL() {
        System.out.println("MySQL Connected!");
    }
}
class ReadExcelFile {
    ReadExcelFile() {
        System.out.println("ExcelFile is Loaded!");
    }
}
