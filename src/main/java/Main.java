@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {

        OnlineWorker onlineWorker = new OnlineWorker("Carla", "Salmerón", 17.00);
        OnSiteWorker onsiteWorker = new OnSiteWorker("Ana", "Lopez", 18.00);

        int monthlyHours = 150;

        System.out.println(onlineWorker + ", accumulating a monthly salary of " +
                onlineWorker.calculateSalary(monthlyHours));

        System.out.println(onsiteWorker + ", accumulating a monthly salary of " +
                onsiteWorker.calculateSalary(monthlyHours));

        System.out.println();

        System.out.println(onlineWorker.calculatePlusHours(20));
        System.out.println(onsiteWorker.calculateNightHours(30));
    }
}
