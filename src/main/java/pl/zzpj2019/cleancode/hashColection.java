package pl.zzpj2019.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class hashColection {

    Map<Integer, Integer> hashMap = new HashMap<>();
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;

    public hashColection(List<Integer> integerList) {
        extendListOfIntegers(integerList);
    }

    public hashColection() {

    }

    public void extendListOfIntegers(List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) { addNewIntegerAfter(integers.get(i)); }
    }

    public void addNewIntegerAfter(Integer integer) {
        if (hashMap.containsKey(integer)) {
            Integer newInteger = hashMap.get(integer);
            hashMap.put(integer, newInteger + 1);
        } else {
            hashMap.put(1, 1);
        }

        if (integer < minValue) {
            minValue = integer;
        }

        if (integer > maxValue) {
            maxValue = integer;
        }
    }

    public int getElementAt(int index) {
        if (hashMap.containsKey(index)) {
            return hashMap.get(index);
        } else {
            return 0;
        }
    }

    public double devideSumOfSqueredKeysBySumOfValues() {
        double sumOfSqueredKeys = 0;
        double sumOfValues = 0;
        for (Entry<Integer, Integer> element : hashMap.entrySet()) {
            sumOfValues += element.getValue();
            sumOfSqueredKeys += element.getKey() * element.getKey();
        }
        return sumOfSqueredKeys / sumOfValues;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }


    public String getFizzBuzzNumber(int number) {
        if (number % 15 == 0) { return "Fizz Buzz"; }
        if (number % 3 == 0) { return "Fizz"; }
        if (number % 5 == 0) { return "Buzz"; }
        return Integer.toString(number);
    }
}