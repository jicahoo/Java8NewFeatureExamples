package com.jichao.java8.feature.bycommontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jichao on 2016/3/24.
 */
public class ParallelStream {

    public static void main(final String... args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            list.add("filename" + i);
        }

        long startA = System.currentTimeMillis();
        Object[] m =list.parallelStream().map((e) -> e + ".txt").toArray();
        long endA = System.currentTimeMillis();
        Arrays.stream(m).forEach(System.out::println);

        long durationA = endA - startA;

        long startB = System.currentTimeMillis();
        Object[] n = list.stream().map((e) -> e + ".txt").toArray();

        long endB = System.currentTimeMillis();
        Arrays.stream(n).forEach(System.out::println);
        long durationB = endB - startB;

        System.out.println("Parallel duration: " + durationA);
        System.out.println("Non-Parallel duration: " + durationB);


    }
}
