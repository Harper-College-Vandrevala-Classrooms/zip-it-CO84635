package com.csc;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Zipper {
    public static <T> List<T> zip(List <T> listOne, List <T> listTwo) {
        List<T> list = new ArrayList<>();

        int sizeOfListOne = listOne.size();
        int sizeOfListTwo = listTwo.size();
        
        int sizeOfLargest = Math.max(listOne.size(), listTwo.size());
        
        for (int i = 0; i < sizeOfLargest; i++) {
            if (i < sizeOfListOne) {
                list.add(listOne.get(i));
            }

            if (i < sizeOfListTwo) {
                list.add(listTwo.get(i));
            }
        }

        return list;
    }

}
