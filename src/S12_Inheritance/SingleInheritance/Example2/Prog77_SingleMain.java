package S12_Inheritance.SingleInheritance.Example2;

public class Prog77_SingleMain {
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1();
        tc1.runTC1();
        CommonToAll c1 = new CommonToAll();
        c1.startBrowser();
        c1.readDataBaseFile();
        c1.readExcelFile();
        c1.closeBrowser();
    }
}
