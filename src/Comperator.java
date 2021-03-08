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

    }
}
