public class OnlineWorker extends Worker {

    private final double INTERNET_RATE = 30.0;

    public OnlineWorker(String name, String surname, double hourPrice) {
            super(name, surname, hourPrice);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return (hoursWorked * hourPrice) + INTERNET_RATE;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("Warning: This method is deprecated. Use the new salary calculator instead.");
    }
}
