package circularlinkedlist.round_robin_algorithm;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        scheduler.addProcess(1, 5, 2);
        scheduler.addProcess(2, 8, 1);
        scheduler.addProcess(3, 12, 3);
        scheduler.addProcess(4, 6, 2);

        scheduler.executeProcesses();
    }
}
