/**
 * Created by Krzysztof on 02.11.2016.
 */
class Prostokat {
    int x, y;
    void tworzprostokat() {
        for (int i=0; i<x; i=i+1) {
            for( int j=0; j<y;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class wykonajProstokat {
    public static void main(String[] args) {
        Prostokat pr = new Prostokat();
        pr.x = 7;
        pr.y = 6;
        pr.tworzprostokat();
    }
}
