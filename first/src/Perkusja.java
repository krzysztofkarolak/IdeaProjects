class Perkusja {
    boolean talerze = true; boolean beben = true;

    void zagrajNaBebnie() {
        System.out.println("bam, bam, baaaa-am-am");
    }

    void zagrajNaTalerzach() {
        System.out.println("brzdęk, brzrzrzdęęk");
    }

}

class PerkusjaTester {

    public static void main(String[] args) {

        Perkusja p = new Perkusja();

        p.beben = true;
        if (p.beben)
        {
            p.zagrajNaBebnie();
        }
        p.zagrajNaTalerzach();
    }
}