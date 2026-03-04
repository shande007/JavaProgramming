package S14_Encapsulation;

public class Prog84_Bank_Ex {

    public static void main(String[] args) {
        ICICIBank sidhant = new ICICIBank("Sidhant",100);
        long bal = sidhant.getBal();
        System.out.println(bal);
//        System.out.println(sidhant.bal);

        sidhant.setBal(200,false);
        System.out.println(sidhant.getBal());

        // Cashier
        ICICIBank cashier = new ICICIBank("Cash",100);
        cashier.setBal(200,true);
        System.out.println(cashier.getBal());
    }
}


class ICICIBank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        System.out.println("ICICIBank.getBal");
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier) {
            System.out.println("ICICIBank.setBal.isCashier");
            this.bal = bal;
        }else{
            System.out.println("Not allowed to modify the bal");
        }
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}
