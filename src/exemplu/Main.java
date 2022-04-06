package exemplu;

public class Main {
    public static void main(String[] args) {
        OShop oShop = OShop.getInstance();
        OShop oShop2 = OShop.getInstance();

        oShop2.setInf("Alta informatie");
        System.out.println(oShop.getInf());
        System.out.println(oShop2.getInf());
    }
}
