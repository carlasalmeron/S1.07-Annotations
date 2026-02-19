public class OnSiteWorker extends Worker {

    private static double fuel = 80.0;

    public OnSiteWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return super.calculateSalary(workedHours) + fuel;
    }

    @Deprecated
    public double calculateNightHours(double nightHour) {
        return 0;
    }

    @Deprecated
    public void oldOnSiteMethod() {
        System.out.println("This is an old on-site method.");
    }
}
