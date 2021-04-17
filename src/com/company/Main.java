package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static Boolean hasDuplicates(int[] array){
        List<Integer> list = Arrays.stream(array)
                .boxed().collect(Collectors.toList());
        List<Integer> list2 = list.stream().distinct()
                .collect(Collectors.toList());
        if(list.size()==list2.size()){
            return false;
        }
            return true;
    }

    public static Boolean hasDuplicates2(int[] array){
        return (Arrays.stream(array).boxed().distinct()
                .count() != array.length);
    }

    public static void main(String[] args) {
	    int[] array= {1, 2, 3, 5, 465, 2, 8, 6, 8};
        System.out.println(hasDuplicates(array));
        System.out.println(hasDuplicates2(array));
    }
}
