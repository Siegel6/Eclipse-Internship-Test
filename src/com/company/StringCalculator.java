package com.company;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringCalculator {
    public static int Add(String numbers){
        int sum = 0;

        try {
            List<Integer> integerList = new LinkedList<>();
            String[] stringList = numbers.split(",?\n|,|\n|\n?,");
            for (String n:stringList) {
                integerList.add(Integer.parseInt(n));
            }
            for (Integer i:integerList){
                sum+=i;
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
