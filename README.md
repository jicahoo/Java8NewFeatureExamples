# Java8NewFeatureExamples
Some examples to use Java 8 new features, like lambda, stream

# Java 8 是什么
* 函数式编程：函数一等公民。
* 集合框架的增强，加上了基于函数式编程的流式接口，和流式接口上的并发。
* 并发：数组并发操作
```java
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ParArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Arrays.parallelSetAll(arr, (index) -> ThreadLocalRandom.current().nextInt());
        System.out.println(Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

```



# Reference
* https://www.cnblogs.com/snowInPluto/p/5981400.html
* http://www.infoq.com/cn/articles/How-Functional-is-Java-8
