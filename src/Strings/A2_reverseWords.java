package Strings;

import java.util.Scanner;

public class A2_reverseWords {
    public static String reverseWords(String s) {
        String [] words = s.split(" +");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String s = sc.nextLine();

        String result = reverseWords(s);
        System.out.println(result);
    }
}
