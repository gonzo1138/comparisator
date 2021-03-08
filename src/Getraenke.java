public class Getraenke implements Comparable<Getraenke>{

    double preis;

    public Getraenke(double preis){
        this.preis = preis;
    }

    @Override
    public int compareTo(Object o){
        Getraenke cg = (Getraenke) o;
        return Double.compare(this.preis, cg.preis);
    }
}
