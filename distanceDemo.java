class Distance {
    protected double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double speedInMilesPerHour = 60; // Speed in miles per hour
        double timeInHours = distanceInMiles / speedInMilesPerHour;
        System.out.println("Time to cover " + distanceInMiles + " miles at " + speedInMilesPerHour + " mph: " + timeInHours + " hours");
    }
}
class DistanceMKS extends Distance {

    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers);
    }

    @Override
    public void travelTime() {
        double speedInKilometersPerSecond = 100; // Speed in km per second
        double timeInSeconds = distanceInMiles * 1.60934 / speedInKilometersPerSecond; // Convert miles to kilometers
        System.out.println("Time to cover " + (distanceInMiles * 1.60934) + " kilometers at " + speedInKilometersPerSecond + " km/s: " + timeInSeconds + " seconds");
    }
}
public class distanceDemo {
    public static void main(String[] args) {
        Distance distanceMiles = new Distance(120); 
        distanceMiles.travelTime();

        DistanceMKS distanceKilometers = new DistanceMKS(193.12); 
        distanceKilometers.travelTime();
    }
}