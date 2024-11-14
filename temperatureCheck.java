class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class temperatureCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the temperature as a command line argument.");
            return;
        }

        try {
            int temperature = Integer.parseInt(args[0]);
            checkTemperature(temperature);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a numeric value.");
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTemperature(int temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("TooHot");
        } else if (temperature < 5) {
            throw new TooCold("TooCold");
        } else {
            System.out.println("Normal");
            double fahrenheit = (temperature * 9.0 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    }
}
