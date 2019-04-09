package java8.review.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-04-09 20:14
 **/
public class ReduceImp {
    public static void main(String[] args) {
        List<Integer> valueList = Arrays.asList(1, 2, 3, 4);
        // 二元相加操作
        int sum = valueList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        // 最大的偶数
        valueList.stream().filter(x -> x % 2 == 0).reduce(Integer::max).ifPresent(System.out::println);
    }
}