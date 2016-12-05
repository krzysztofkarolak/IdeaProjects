/**
 * Created by Krzysztof on 02.11.2016.
 */

class Film {
        String tytul;  String rodzaj;  int ocena;

        void odtworz() {
            System.out.println("Odtwarzany film:");
            System.out.println("Tytuł: " + tytul + " Rodzaj: " + rodzaj + "\n" + "Ocena: " + ocena);
   }
   }


class FilmTester {

    public static void main(String[] args) {

        Film pierwszy = new Film();
        pierwszy.tytul = "Przeminęło z hossą";
        pierwszy.rodzaj = "Tragedia";
        pierwszy.ocena = -2;

        Film drugi = new Film();
        drugi.tytul = "Matrix dla zuchwałych";
        drugi.rodzaj = "Komedia";
        drugi.ocena = 5;
        drugi.odtworz();

        Film trzeci = new Film();
        trzeci.tytul = "Byte Club";
        trzeci.rodzaj = "Tragedia, ale o wydźwięku optymistycznym";
        trzeci.ocena = 127;
    }

}

