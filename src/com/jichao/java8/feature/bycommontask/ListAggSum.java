package com.jichao.java8.feature.bycommontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jichao on 2016/3/24.
 */
public class ListAggSum {

    public static void main(final String... args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer sum = list.stream().reduce(0,(l,r)->l+r);
        System.out.println(sum);

    }
}
