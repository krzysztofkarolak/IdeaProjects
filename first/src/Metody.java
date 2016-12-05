/**
 * Created by Krzysztof on 05.11.2016.
 */
class Metody {
    //nic nie zwraca
    void idz() {
    }
    //zwraca liczbę
    int podajTajnyNumer() {
        return 42;
    }

}

class wywolajmetody {
    public static void main(String[] args) {
        Metody m = new Metody();

        int tajnyNumer = m.podajTajnyNumer();
        System.out.print(tajnyNumer);
    }
}
