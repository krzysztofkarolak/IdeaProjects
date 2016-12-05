public class Krasomowca {
    public static void main (String[] args) {
        // trzy grupy sów, które bd wybierane do zdania (dodaj wasne!)
        String[] listaSlow1 = {"architektura wielowarstwowa",
 "30000 metrów", "rozwizanie B-do-B", "aplikacja kliencka",
 "interfejs internetowy", "inteligentna karta", "rozwizanie dynamiczne", "sze sigma", "przenikliwość"};
        String[] listaSlow2 = {"zwiększa możliwości", "poprawia atrakcyjność",
 "pomnaża wartość", "opracowana dla", "bazuje dla", "rozproszona",
 "sieciowa", "skoncentrowana na", "podniesion na wyższy poziom",
 "skierowanej", "udostpniona"};
        String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiazania",
 "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};
        // okrelenie, ile jest sów w kadej z list
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;
        // generacja trzech losowych sów (lub zwrotów)
        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);
        // stworzenie zdania
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " +
                listaSlow3[rnd3];
        // wywietlenie zdania
        System.out.println("To jest to, czego nam trzeba: " + zdanie);
    }
}