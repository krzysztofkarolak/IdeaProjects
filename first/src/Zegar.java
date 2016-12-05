/**
 * Created by Krzysztof on 06.11.2016.
 */
class Zegar {
    private String czas;
    public void setCzas(String c) {
        czas = c;
    }
    public String getCzas() {
        return czas;
    }
}

class ZegarTester {
    public static void main(String[] args) {
        Zegar z = new Zegar();
        z.setCzas("1245");
        String dta = z.getCzas();
        System.out.println("Czas: " + dta);
    }
}
