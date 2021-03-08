public class Getraenke implements Comparable<Getraenke>{

    double preis;
    String name;

    public Getraenke(double preis, String name){
        this.preis = preis;
        this.name = name;
    }

    @Override
    public int compareTo(Getraenke o) {             // .compareTo() returns -1 for <, 0 for =, 1 for >
        return Double.compare(this.preis, o.preis);
    }
}

