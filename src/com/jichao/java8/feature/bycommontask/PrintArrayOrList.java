package com.jichao.java8.feature.bycommontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jichao on 2016/3/24.
 */
public class PrintArrayOrList {
    public static void main(final String... args){
        String[] array = new String[]{"A","B","C"};
        Arrays.stream(array).forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        //Method 1
        list.forEach(System.out::println);

        //Method 2
        list.stream().forEach(System.out::println);

    }
}
