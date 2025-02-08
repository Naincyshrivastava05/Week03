package StringConcatenation;

import java.util.Random;

public class StringConcatenationComparison {

    // Concatenation using String
    public static long testStringConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a"; // Creates a new object each time
        }
        return System.currentTimeMillis() - startTime;
    }

    // Concatenation using StringBuilder
    public static long testStringBuilderConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return System.currentTimeMillis() - startTime;
    }

    // Concatenation using StringBuffer
    public static long testStringBufferConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return System.currentTimeMillis() - startTime;
    }

    public static double[] compare(int size){

        double[] output = new double[3];



        // String Performance
        long start = System.nanoTime();
        testStringConcatenation(size);
        long stringTime = System.nanoTime() - start;



        //  String Builder Performance
        start = System.nanoTime();
        testStringBuilderConcatenation(size);
        long stirngBuilderTime = System.nanoTime() - start;

        //  quicke sort Performance
        start = System.nanoTime();
        testStringBufferConcatenation(size);
        long stringBufferTime = System.nanoTime() - start;

        output[0] = stringTime / 1000000.0;
        output[1] = stirngBuilderTime / 1000000.0;
        output[2] = stringBufferTime/1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("String Time: " + output[0] + " ms");
        System.out.println("String Builder Time: " + output[1] + " ms");
        System.out.println("String Buffer Time: " + output[2] + " ms");
        System.out.println("---------------------------------");
        return output;

    }

    public static void main(String[] args) {
        int[] size = {1000,10000, 100000};
        for(int s:size){
            compare(s);
        }
    }
}
