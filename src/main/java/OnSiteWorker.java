public class OnSiteWorker extends Worker {

    private final double fuel = 80.0;

    public OnSiteWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return (workedHours * hourPrice) + fuel;
    }

    @Deprecated
    public double calculateNightHours(double nightHours) {
        System.out.println("Warning: calculateNightHours is deprecated.");
        return (nightHours * hourPrice);
    }

    @Deprecated
    public void oldOnSiteMethod() {
        throw new UnsupportedOperationException("This method is no longer supported.");
    }
}
