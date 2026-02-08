public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public Worker(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public double calculateSalary(double workedHours) {
        return workedHours * priceHour;
    }

    @Override
    public String toString () {
        return "The employee " + name + " " + surname + " is receiving " + priceHour + " per hour worked";
    }
}
