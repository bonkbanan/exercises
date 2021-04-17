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

    public static Boolean hasDuplicates3(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i + 1])
                return true;
        }
        return false;
    }

//hasDuplicate == hasDuplicate2 == hasDuplicate3
    public static void main(String[] args) {
	    int[] array= {1, 2, 3, 5, 465, 2, 8, 6, 8};
        System.out.println(hasDuplicates(array));
        System.out.println(hasDuplicates2(array));
        System.out.println(hasDuplicates3(array));

        String s1 = "Hello World";
        StringBuilder sb= new StringBuilder(s1);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
