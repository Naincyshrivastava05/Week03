package filereader.couuntoccurence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurenc {
    public static int wordOccurence(String filePath, String target){
        int count = 0;


        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = "";
            while((line = br.readLine())!=null){
                String[] words = line.split("\\s+");
                for(String word:words){
                    if(word.equalsIgnoreCase(target)){
                        count++;
                    }
                }
            }
        }
        catch (IOException e){
            System.out.println("Error occured"+e.getMessage());
            e.printStackTrace();
        }
        return  count;
    }

    public static void main(String[] args) {
        String s = "C:\\Gabgemini\\Week03\\String-Manipulation\\src\\main\\java\\filereader\\couuntoccurence\\countword.txt";
        String target = "wood";
        System.out.println("Count:"+wordOccurence(s,target));
    }
}
