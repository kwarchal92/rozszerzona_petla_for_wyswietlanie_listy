package rozszerzona_petla_for;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Katarzyna", "Adam", "Stanisław", "Kacper", "Magdalena", "Klaudia");

        for(String im : imiona)
        {
            System.out.println(im);
        }
    }
}
