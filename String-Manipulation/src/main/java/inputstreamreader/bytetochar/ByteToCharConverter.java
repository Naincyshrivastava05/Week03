package inputstreamreader.bytetochar;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteToCharConverter {
    public static String readFileAsString(String filePath){
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }catch (IOException e){
            System.out.println("Error cought "+e.getMessage());
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String filePath = "C:\\Gabgemini\\Week03\\String-Manipulation\\src\\main\\java\\inputstreamreader\\bytetochar\\text.txt";
        String ans = readFileAsString(filePath);
        System.out.println(ans);

    }
}
