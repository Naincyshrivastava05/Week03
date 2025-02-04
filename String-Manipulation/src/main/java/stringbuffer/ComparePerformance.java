package stringbuffer;

import java.util.Scanner;

public class ComparePerformance {
    public static long[] compare(String s){
        long startTime, endTime;
        long[] arr = new long[2];
        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 100000; i++) {
            sb.append(" Performance Test");
        }
        endTime = System.nanoTime();
        arr[0] =  (endTime - startTime);
        System.out.println("StringBuilder Time: " +arr[0] + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sbf.append(" Performance Test");
        }
        endTime = System.nanoTime();
        arr[1] =  (endTime - startTime);
        System.out.println("StringBuffer Time: " + arr[1]+ " ns");

    return  arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String-");
        String s = sc.next();

        compare(s);
    }
}
