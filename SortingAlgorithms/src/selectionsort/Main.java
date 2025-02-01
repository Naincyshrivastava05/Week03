package selectionsort;

public class Main {
    public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 90, 65, 88};
        System.out.println("Unsorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }

     SelectionSort.selectionSort(examScores);

        System.out.println("\nSorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
