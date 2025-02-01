package circularlinkedlist.taskschedular;

public class TaskSchedular {
    private TaskNode head;
    public TaskSchedular(){
        head = null;
    }

    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate){
        TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);

        if(head == null){
            node.next = node;
            head = node;
        }
        else{
            TaskNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            head = node;
        }
    }
    public void addaAtEnd(int taskId, String taskName, int priority, String dueDate){
        TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);

        if(head == null){
            node.next = node;
            head = node;
        }
        else{
            TaskNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
    }
    public void addInBetween(int taskId, String taskName, int priority, String dueDate, int index){
        if(index == 0){
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;
        for(int i =0; i<index-1; i++){
            temp  = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void removeTaskById(int taskId){
        if(head == null){
            System.out.println("Task List is empty");
        }
        TaskNode temp = head;
        TaskNode prev = null;

        do{
            if(temp.taskId == taskId){
                if(temp.next == temp){
                    head = null;
                }
                else{
                    if(temp == head){
                        TaskNode last = head;
                        while(last.next !=head){
                            last = last.next;
                        }
                        head = temp.next;
                        last.next = head;
                    }else{
                        prev.next = temp.next;
                    }
                }
                System.out.println("Task "+ taskId+" removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp!=head);
        System.out.println("Task is not found");
    }
    public void currentTask(){
        if(head == null){
            System.out.println("There is no task");
        }
        System.out.println("current TaskId "+ head.taskId+ " Task NAME "+head.taskName+ " task priority:"+ head.priority+ " task due date: "+ head.dueDate);
    }
    public void moveToNextTask(){
        if(head == null){
            System.out.println("No task available");
            return;
        }
        head = head.next;
        currentTask();

    }

    public void displayAllTask(){
        if(head == null){
            System.out.println("No task available");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println("TaskId "+ temp.taskId+ " Task NAME "+temp.taskName+ " task priority:"+ temp.priority+ " task due date: "+ temp.dueDate);
            temp = temp.next;
        }while(temp!=head);

    }

    public void searchByTaskPriority(int priority){
        if(head == null){
            System.out.println("No task available");
            return;
        }
        TaskNode temp = head;
        boolean find = false;
        do{
            if(temp.priority == priority){
                find = true;
                System.out.println("TaskId "+ temp.taskId+ " Task NAME "+temp.taskName+ " task priority:"+ temp.priority+ " task due date: "+ temp.dueDate);

            }
            temp = temp.next;
        }while(temp != head);
        if(!find){
            System.out.println("No task found");
        }
    }

}
