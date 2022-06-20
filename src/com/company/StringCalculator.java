package com.company;



import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public static int Add(String numbers){
        int sum = 0;
        try {
            ArrayList<Integer> integerList = new ArrayList<>();
            String[] stringList = numbers.split(",");
            if (stringList.length > 1) {
                for (int i = 0; i < 2; i++) {
                    sum += Integer.parseInt(stringList[i]);
                }
            } else if (stringList.length == 1) {
                sum = Integer.parseInt(stringList[0]);
            } else {
                System.out.println("Nie podano żadnych liczb");
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
