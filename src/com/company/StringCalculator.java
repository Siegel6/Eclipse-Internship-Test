package com.company;



import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public static int Add(String numbers){
        int sum = 0;
        try {
            ArrayList<Integer> integerList = new ArrayList<>();
            String[] stringList = numbers.split(",");
            for (String n:stringList) {
                sum += Integer.parseInt(n);
            }
            return sum;
        }
        catch (NullPointerException e){
            return 0;
        }
        catch (NumberFormatException e){
            return 0;
        }

    }
}
