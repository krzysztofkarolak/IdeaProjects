/**
 * Created by Krzysztof on 05.11.2016.
 *
 * Metody ustawiające
 * i zwracające powinny
 * być publiczne.
 */
class GitaraElektryczna {
    private String rodzaj;
    private int iloscKonwerterow;
    private boolean uzywanaPrzezGwiazde;
    public String getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(String rodzajGitary) {
        rodzaj = rodzajGitary;
    }
    public int getIloscKonwerterow() {
        return iloscKonwerterow;
    }
    public void setIloscKonwerterow(int ilosc) {
        iloscKonwerterow = ilosc;
    }
    public boolean getUzywanaPrzezGwiazde() {
        return uzywanaPrzezGwiazde;
    }
    public void setUzywanaPrzezGwiazde(boolean takCzyNie) {
        uzywanaPrzezGwiazde = takCzyNie;
    }
}
class PanelGitar {
    public static void main(String[] args) {
        GitaraElektryczna g1 = new GitaraElektryczna();

        g1.setRodzaj("Klasyczna");
        g1.setIloscKonwerterow(2);
        g1.setUzywanaPrzezGwiazde(true);

        System.out.println(g1.getRodzaj());
        System.out.println("Konwerterów: " + g1.getIloscKonwerterow());
        if(g1.getUzywanaPrzezGwiazde()) {
            System.out.print("Używana przez gwiazdę!");
        }
    }
}