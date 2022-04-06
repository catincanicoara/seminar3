package exemplu;

public class OShop {
    private static OShop instance;
    private String inf = "info";

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    public OShop() {
    }

    public static OShop getInstance() {
        if(instance==null){
            instance = new OShop();
        }
        return instance;
    }
}
