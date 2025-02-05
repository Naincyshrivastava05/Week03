package challengeproblem;

public class CompareStringBufferAndBuilder {
        public static void comparePerformance() {
            String word = "hello";
            int iterations = 1_000_000;

            long startTime = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                sb.append(word);
            }
            long endTime = System.nanoTime();
            System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

            startTime = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                sbf.append(word);
            }
            endTime = System.nanoTime();
            System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
        }

        public static void main(String[] args) {
            comparePerformance();
        }


}
