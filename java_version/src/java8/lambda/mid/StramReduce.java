package java8.lambda.mid;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-11 15:15
 **/
public class StramReduce {
    public static void main(String[] args){
        int[] nums = new int[]{12};
        Reduce reduce = new Reduce();
        int sum = reduce.getSum(nums);
        System.out.println(sum);
    }
}

class Reduce{
    public int getSum(int[] nums){
        OptionalInt optionalInteger = Arrays.stream(nums).reduce((x,y)->x*y);
        return optionalInteger.isPresent()?optionalInteger.getAsInt():-1;
    }
}
