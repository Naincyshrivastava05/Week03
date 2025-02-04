package stringbuffer;

import java.util.Scanner;

public class ConcateString {
    public static String concateString(String[] arr){
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array-");
        int n = sc.nextInt();
        System.out.println("Enter strings");
        String[] arr = new String[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.next();
        }

        System.out.println(concateString(arr));
    }
}
