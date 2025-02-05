package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static String reader(String file){
        String s = "";
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String  line;
            while((line = br.readLine())!=null){
                s+=line;
                s+="\n";
            }
        }catch (IOException e){
            System.out.println("Error while reading file-"+ e.getMessage());
            e.printStackTrace();
        }
        return s;
    }
    public static void main(String[] args) {
        String path = "C:\\Gabgemini\\Week03\\String-Manipulation\\src\\main\\java\\filereader\\text.txt";
        String fileText = reader(path);
        System.out.println(fileText);
    }

}
