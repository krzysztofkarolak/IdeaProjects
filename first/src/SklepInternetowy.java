/**
 * Created by Krzysztof on 03.11.2016.
 */
class SklepInternetowy {
    int checkcena, cenanow;
    String produktnow;
    String [] nazwaproduktu = new String[10];
    int [] cena = new int[10];
    int [] iddoceny = new int[10];

    void pokazprodukty(int ile) {
        for(int i=0; i<ile;i=i+1) {
            produktnow=nazwaproduktu[i];
            checkcena=iddoceny[i];
            cenanow=cena[checkcena];
            System.out.println("Produkt: " + produktnow + ", Cena: " +  cenanow);
        }
    }
}

class PanelSklepow {
    public static void main(String[] args) {
        SklepInternetowy s1 = new SklepInternetowy();
        s1.nazwaproduktu[0] = "Proszek do pieczenia";
        s1.nazwaproduktu[1] = "Proszek do jedzenia";
        s1.nazwaproduktu[2] = "Proszek do prania";
        int iloscproduktow = s1.nazwaproduktu.length;
        for(int i=0;i<iloscproduktow;i=i+1) {
            s1.cena[i] = i*5;
        }
        s1.cena[0] = 5;

        for(int i=0;i<iloscproduktow;i=i+1) {
            s1.iddoceny[i] = i;
        }

        s1.pokazprodukty(3);
    }
}
