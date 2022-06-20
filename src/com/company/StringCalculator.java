package com.company;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringCalculator {
    public static int Add(String numbers){
        int sum = 0;
        String numbers2;
        try {
            List<Integer> integerList = new LinkedList<>();
            numbers2 = numbers.replaceAll("[^0-9]", " ");
            String[] stringList = numbers2.split(" ");
            int[] intArr = Stream.of(stringList)
                    .filter(Pattern.compile("^[\\d]+$").asPredicate())
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println();
            for (int n:intArr) {
                sum+=n;
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
