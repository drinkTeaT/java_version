package java8.review.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description：list原地lambda排序
 * @Author： Administrator
 * @Date： 2019-04-08 23:09
 **/
public class ListCompare {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "ad", "fww", "faw", "Aa");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }
}
