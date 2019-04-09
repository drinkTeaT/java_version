package java8.review.lambda;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @Description：比较器函数表达式很神奇啊！ </br>
 * 直接引入Comparator的一个方法
 * @Author： Administrator
 * @Date： 2019-04-08 23:35
 **/
public class LambdaCompare {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "ad", "fww", "faw", "Aa");
        list.sort(comparing(String::length).reversed().thenComparing(String::compareToIgnoreCase));
        System.out.println(list);
    }
}
