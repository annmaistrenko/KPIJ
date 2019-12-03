package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static boolean isOk (String s){
        for (int j = 0;j  <s.length() -1 ;j++){
            for (int k =j+1;k<s.length() ;k++){
                if (s.charAt(j) == s.charAt(k)){
                    return false;

                }
            }
        }
        return true;
    }
    public static String[] form(String[] ff){
        List<String> s = Arrays.stream(ff)
                .filter(Main::isOk)
                .collect(Collectors.toList());
        String[] itemsArray = new String[s.size()];
        itemsArray = s.toArray(itemsArray);
        return itemsArray;
    }
    static int i;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input amount of elements:");
        String num = scan.next();
        int number = Integer.parseInt(num);
        System.out.println("Input strings:");
        Scanner scan1 = new Scanner(System.in);
        String[] newString = new String[number];
        for (int i = 0;i < number ;i++) {
            newString[i] = scan1.nextLine();
        }
        System.out.println(Arrays.toString(form(newString)));
        System.out.println(i);



    }

}
