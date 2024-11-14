import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class capitalFinder {
    private static Map<String, String> countryCapitalMap = new HashMap<>();

    static {
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Germany", "Berlin");
    }

    public static String findCapital(String country) throws NoMatchFoundException {
        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country);
        } else {
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one country name.");
            return;
        }

        String country = args[0];

        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}