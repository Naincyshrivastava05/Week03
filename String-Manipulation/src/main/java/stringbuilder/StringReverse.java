package  stringbuilder;

import java.util.Scanner;

public class StringReverse {
    public static String reverse(String s){
        if(s.length()<=1){
            return s;
        }
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i =s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String-");
        String s = sc.next();
        System.out.println(reverse(s));
    }
}
