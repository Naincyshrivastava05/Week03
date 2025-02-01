package singlylinkedlist.student_record_management;

// StudentRecordManagement.java
public class StudentRecordManagement {
    private Student head;

    // Add a new student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a new student at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add a new student at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete a student record by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search for a student record by roll number
    public void searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found!");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available!");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade based on roll number
    public void updateGrade(int rollNumber, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found!");
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        // Add student records
        srm.addAtBeginning(1, "John Doe", 20, "A");
        srm.addAtEnd(2, "Jane Smith", 19, "B");
        srm.addAtPosition(2, 3, "Alice Johnson", 21, "A+");

        // Display all records
        System.out.println("All Student Records:");
        srm.displayAll();

        // Search for a student
        System.out.println("\nSearch for Roll Number 2:");
        srm.searchByRollNumber(2);

        // Update a student's grade
        System.out.println("\nUpdating grade for Roll Number 3:");
        srm.updateGrade(3, "A");

        // Display all records
        System.out.println("\nAll Student Records After Update:");
        srm.displayAll();

        // Delete a student record
        System.out.println("\nDeleting Roll Number 1:");
        srm.deleteByRollNumber(1);

        // Display all records
        System.out.println("\nAll Student Records After Deletion:");
        srm.displayAll();
    }
}
