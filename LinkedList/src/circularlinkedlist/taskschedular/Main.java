package circularlinkedlist.taskschedular;

public class Main {

        public static void main(String[] args){
            TaskSchedular scheduler = new TaskSchedular();
            // Adding tasks
            scheduler.addAtBeginning(1, "Task A", 3, "2023-10-15");
            scheduler.addaAtEnd(2, "Task B", 1, "2023-10-20");
            scheduler.addInBetween(3, "Task C", 2, "2023-10-25", 1);

            // Display all tasks
            System.out.println("All Tasks:");
            scheduler.displayAllTask();

            // View current task
            System.out.println("View Current Task:");
            scheduler.currentTask();

            // Move to next task
            System.out.println("Move to Next Task:");
            scheduler.moveToNextTask();

            // Search tasks by priority
            System.out.println("Search Tasks with Priority 2:");
            scheduler.searchByTaskPriority(2);

            // Remove a task by ID
            System.out.println("Removing Task with ID 2:");
            scheduler.removeTaskById(2);

            // Display all tasks after removal
            System.out.println("All Tasks After Removal:");
            scheduler.displayAllTask();
        }
    }

