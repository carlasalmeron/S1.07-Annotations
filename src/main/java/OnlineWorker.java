public class OnlineWorker extends Worker {

    private static final double INTERNET_FEE = 50.0;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary (double workedHours) {
        return super.calculateSalary(workedHours) + INTERNET_FEE;
    }

    @Deprecated
    public double calculatePlusHours(double plusHour) {
        return 0;
    }
}
