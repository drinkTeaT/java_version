package java8.lambda.construct;

import java.util.stream.Stream;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-11 15:41
 **/
public class StreamAuto {
    public static void main(String[] args){
        // 迭代方式
        Stream.iterate(0,x->x+1).limit(12).forEach(System.out::println);
        // 生成器方式
        Stream.generate(Math::random).limit(13).forEach(System.out::println);
    }
}