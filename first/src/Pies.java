/**
 * Created by Krzysztof on 02.11.2016.
 */
class Pies {
    String imie, wlasciciel;
    boolean czyigla, czyszczeka;

    void pokazdane() {
        System.out.print("\nDane Psa: \nImie psa: " + imie + " Wlasciciel: " + wlasciciel);
        if(czyigla) {
            System.out.print("\n IGLA!!!");
        }
        else {
            System.out.print("\n Nie bity, nie stuka nie puka");
        }
    }
    void dajglos() {
        if(czyszczeka) {
            System.out.print("\n HAU");
        }
        else {
            System.out.print("\n MIAU");
        }
    }
}

class PiesTester {

    public static void main(String[] args) {
        Pies pies1 = new Pies();

        pies1.imie = "Daniel";
        pies1.wlasciciel = "Harold";
        pies1.czyigla = true;
        pies1.czyszczeka = false;
        pies1.pokazdane();
        pies1.dajglos();

        Pies pies2 = new Pies();
        pies2.imie = "JANUSZ BIZNESU";
        pies2.pokazdane();
        pies2.czyszczeka = true;
        pies2.dajglos();
    }

}