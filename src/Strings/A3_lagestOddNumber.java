package Strings;

import java.util.Scanner;

public class A3_lagestOddNumber {
    public static String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder();

        for(int i = num.length()-1;i>=0;i--){
            if((Character.getNumericValue(num.charAt(i)))%2 != 0){
                //use char c = num.charAt(i)  for run code faster
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string= ");
        String num = sc.nextLine();

        String result = largestOddNumber(num);
        System.out.println(result);
    }
}
