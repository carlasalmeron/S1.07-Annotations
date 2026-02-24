import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        List<Worker> employees = new ArrayList<>();

        employees.add(new OnlineWorker("Carla", "Salmeron", 25.0));
        employees.add(new OnSiteWorker("Lucas", "García", 25.0));

        System.out.println("--- Calculating Salaries ---");
        for (Worker worker : employees) {
            System.out.println("Worker: " + worker.name + " " + worker.surname +
                    " | Total Salary: " + worker.calculateSalary(160) + "€");
        }

        System.out.println("\n--- Testing Deprecated Methods ---");

        OnlineWorker onlineEmployee = new OnlineWorker("Anna", "Smith", 20.0);
        OnSiteWorker onsiteEmployee = new OnSiteWorker("Marc", "Vila", 20.0);

        onlineEmployee.oldMethod();

        double nightPay = onsiteEmployee.calculateNightHours(10);
        System.out.println("Night hours calculation: " + nightPay + "€");
    }
}
