import java.util.ArrayList;
class ProstyPortal {
    private ArrayList<String> polaPolozenia;
    // int iloscTrafien; (ju niepotrzebne)
    public void setPolaPolozenia(ArrayList<String> ppol) {
        polaPolozenia = ppol;
    }
    public String sprawdz(String ruch) {
        String wynik = "pud	o";
        int indeks = polaPolozenia.indexOf(ruch);
        if (indeks >= 0) {
            polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            } // koniec if
        } // koniec if
        return wynik;
    } // koniec metody
} // koniec klasy
