package java8.review.lambda;

import java.util.function.Consumer;

/**
 * @Description：lambda的方法引用 </br>
 * 考虑重载
 * @Author： Administrator
 * @Date： 2019-04-08 23:02
 **/
public class LambdaFun {
    public static void main(String[] args) {
        Consumer<AppleStore> consumer = AppleStore::sellApple;
        consumer.accept(new AppleStore());
    }
}

class AppleStore {
    public void sellApple() {
        System.out.println("empty apple");
    }

    public void sellApple(int i) {
        System.out.println(i);
    }
}
