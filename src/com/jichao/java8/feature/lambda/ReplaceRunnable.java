package com.jichao.java8.feature.lambda;

/**
 * Created by jichao on 2016/3/24.
 */
public class ReplaceRunnable {

    public static void main(final String... args){
        //ReplaceRunnable.beforeJava8CreateRunnable();
        ReplaceRunnable.afterJava8CreateRunnable();
    }

    public static void beforeJava8CreateRunnable(){
        Runnable r = new Runnable() {
            public void run() {
                System.out.println(" world!");
            }
        };
        r.run();
    }

    public static void afterJava8CreateRunnable(){
        Runnable r = () -> System.out.println("I am Java 8 Runnabl. A closure!");
        r.run();
    }
}
