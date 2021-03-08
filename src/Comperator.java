import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comperator {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(123,456,789,98,756,654,534,2342,112,42);
        for(int i:intList) System.out.print(i + " ");
        System.out.println();

        Collections.sort(intList);

        for(int i:intList) System.out.print(i + " ");

        System.out.println("\n");  // -----------------

        List<Getraenke> getraenkeliste = Arrays.asList(
                new Getraenke(0.90, "Gerolsteiner"),
                new Getraenke(1.20, "Fritz Cola"),
                new Bier(1.80, "Flensburger", 3.8, "Pils"),
                new Bier(1.50, "Bitburger", 3.4, "Pils"),
                new Bier(1.80, "Corona", 2.9, "Mischmasch"),
                new Bier(2.50, "Duff Bier", 3.4, "Helles"),
                new Bier(1.20, "Früh Kölsch", 3.70, "Kölsch"),
                new Bier(1.40, "Gaffel Kölsch", 3.80, "Kölsch"),
                new Bier(1.60, "Hellers Kölsch", 3.50, "Kölsch"),
                new Bier(1.90, "Mühlen Kölsch", 3.60, "Kölsch"),
                new Bier(2.50, "Düsseldorfer Alt", 4.20, "Alt"),
                new Bier(3.20, "Obersdorfer Weizen", 4.00, "Weizen")
        );

        for(Getraenke g:getraenkeliste) System.out.print(g.name + " ");
        System.out.println();

        Collections.sort(getraenkeliste);

        for(Getraenke g:getraenkeliste) System.out.print(g.name + " ");

    }
}
