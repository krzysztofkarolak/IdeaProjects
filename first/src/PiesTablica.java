class PiesTablica {
    String imie;
    public static void main (String[] args) {
        // tworzymy obiekt Pies i uywamy go
        PiesTablica pies1 = new PiesTablica();
        pies1.imie = "Azorek";
        pies1.szczekaj();
        // teraz tworzymy tablic obiektów Pies
        PiesTablica[] mojePsy = new PiesTablica[4];
        // i zapisujemy w niej obiekty
        mojePsy[0] = new PiesTablica();
        mojePsy[1] = new PiesTablica();
        mojePsy[2] = new PiesTablica();
        mojePsy[3] = pies1;
        // teraz uzyskujemy dostp do obiektów,
        // odwo	ujc si do nich przez tablic
        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";
        mojePsy[2].imie = "Koma";
        // Hm.... jak ma na imi pies
        // z komórki mojePsy[2] ?
        System.out.print("Ostatni pies ma na imi ");
        System.out.println(mojePsy[2].imie);
        // A teraz w ptli kaemy wszystkim
        // psom szczeka
        int x = 0;
        while (x < mojePsy.length) {
            mojePsy[x].szczekaj();
            x = x + 1;
        }
    }
    public void szczekaj() {
        System.out.println(imie + " szczeka: Hau, hau!!");
    }
    public void jedz() { }
    public void gonKota() { }
}