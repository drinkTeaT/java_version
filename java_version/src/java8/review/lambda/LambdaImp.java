package java8.review.lambda;

import java.util.function.Consumer;

/**
 * @Description：lambda表达式实现函数式接口
 * @Author： Administrator
 * @Date： 2019-04-08 22:49
 **/
public class LambdaImp {
    public static void main(String[] args) {
        // lambda实现函数式接口
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(14);
    }
}
