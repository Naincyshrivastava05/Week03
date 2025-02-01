package circularlinkedlist.round_robin_algorithm;

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head; // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    // Remove process after execution
    public void removeProcess(int processId) {
        if (head == null) return;

        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void executeProcesses() {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        int totalTime = 0, completedProcesses = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;
        Process current = head;

        System.out.println("\nExecuting Processes:");
        while (completedProcesses < getProcessCount()) {
            if (current.burstTime > 0) {
                int execTime = Math.min(timeQuantum, current.burstTime);
                current.burstTime -= execTime;
                totalTime += execTime;
                System.out.println("Process " + current.processId + " executed for " + execTime + " units.");

                if (current.burstTime == 0) {
                    completedProcesses++;
                    int turnaroundTime = totalTime;
                    int waitingTime = turnaroundTime - execTime;
                    totalTurnaroundTime += turnaroundTime;
                    totalWaitingTime += waitingTime;
                    System.out.println("Process " + current.processId + " completed. Turnaround Time: " + turnaroundTime + ", Waiting Time: " + waitingTime);
                    removeProcess(current.processId);
                }
            }
            current = current.next;
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / completedProcesses);
    }

    // Get total process count
    private int getProcessCount() {
        if (head == null) return 0;

        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}