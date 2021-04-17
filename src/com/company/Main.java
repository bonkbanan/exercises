package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        Student jhony = new Student("John", LocalDate.of(2000, Month.MAY,17), 85);
        Student paul = new Student("Paul", LocalDate.of(1999, Month.JULY,1), 90);
        Student kolya = new Student("Kolya", LocalDate.of(2002, Month.APRIL,6), 70);
        Student sasha = new Student("Sasha", LocalDate.of(2005, Month.NOVEMBER,24), 29);
        Student tom = new Student("Tom", LocalDate.of(2001, Month.JANUARY,2), 10);

        List<Student> students= new ArrayList<>();
        students.add(jhony);
        students.add(paul);
        students.add(kolya);
        students.add(sasha);
        students.add(tom);
//        for (Student student:students) {
//            //if(student.getMarkJava()<50) System.out.println(student.getName());
//            if(student.getBirthday().getYear()>2000) System.out.println(student.getName());
//        }
        students.stream().filter(student -> student.getMarkJava()>50)
                .forEach(System.out::println);
        System.out.println(students.stream().filter(el -> el.getMarkJava() > 80).count());
        System.out.println(students.stream().max(Comparator.comparing(student -> student.getMarkJava())));
        System.out.println(students.stream().mapToInt(student -> student.getMarkJava()).max().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMarkJava()).min().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMarkJava()).sum());
        System.out.println(students.stream().mapToInt(student -> student.getMarkJava()).average().getAsDouble());
        System.out.println(students.stream().count());

    }
}
