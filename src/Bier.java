public class Bier extends Getraenke{

    double alkoholgehalt;
    String sorte;

    public Bier(double preis, String name, double alkoholgehalt, String sorte){
        super(preis, name);

        this.alkoholgehalt = alkoholgehalt;
        this.sorte = sorte;

    }
}
