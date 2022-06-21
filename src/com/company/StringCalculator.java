package com.company;



import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class StringCalculator {
    public static int Add(String numbers) throws Exception {
        int sum = 0;
        String numbers2;
        try {
            List<Integer> negIntegerList = new LinkedList<>();
            numbers2 = numbers.replaceAll("[^-0-9]", ",");
            numbers = numbers2.replaceAll(",+",",");
            if (numbers.startsWith(",")){
                numbers=numbers.substring(1);
            }
            String[] stringArr = numbers.split(",");
            List<String> stringList = Arrays.asList(stringArr);
            if (stringList.get(0).equals(",")){
                stringList.remove(0);
            }
            for (String n:stringList) {
                if (Integer.parseInt(n)>=0){
                    if (Integer.parseInt(n) <= 1000) {
                        sum+=Integer.parseInt(n);}
                    }

                else{
                    negIntegerList.add(Integer.parseInt(n));
                }

            }
            if (negIntegerList.size()>=1){
            throw new IllegalArgumentException("negatives not allowed"+ Arrays.toString(negIntegerList.toArray()));}
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