public abstract class Worker {
    protected String name;
    protected String surname;
    protected double hourPrice;

    public Worker(String name, String surname, double hourPrice) {
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;
    }

    public abstract double calculateSalary(double hoursWorked);

}
