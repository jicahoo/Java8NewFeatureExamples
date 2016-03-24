package com.jichao.java8.feature.bycommontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jichao on 2016/3/24.
 */
public class ListToCsl {
    public static void main(final String... args){
        String[] list = new String[]{"A","B","C"};
        //Method 1: Reduce: just like SQL agg function.
        String result = Arrays.stream(list).reduce("",(l ,r) ->l+ (l.isEmpty()?r:","+r));
        System.out.println("Method 1: "+result);

        //Method 2:Collector The best way. More efficient.
        String result2 = Arrays.stream(list).collect(Collectors.joining(","));
        System.out.println("Method 2: "+result2);

    }
}
