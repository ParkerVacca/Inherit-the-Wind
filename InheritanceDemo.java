import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Bill", "Davis", "001", "Mr.", 1972, 20.0));
        workers.add(new Worker("Mike", "Rox", "002", "Mrs.", 1995, 25.0));
        workers.add(new Worker("Jim", "Tonali","003", "Dr.", 1965, 30.0));
        workers.add(new SalaryWorker("Rachel", "Cook", "004", "Ms.", 1980, 32.0, 60000));
        workers.add(new SalaryWorker("Parker", "Brown", "005", "Mr.", 1992, 42.0, 80000));
        workers.add(new SalaryWorker("Robert", "Spencer", "006", "Mr.", 1981, 45.0, 90000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            System.out.println("NAME                           PAY");
            System.out.println("==================================");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}