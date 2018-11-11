package java8.lambda.mid;

import java.util.Arrays;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-11 15:09
 **/
public class StreamMatch {
    public static void main(String[] args){
        Match match = new Match();
        int[] nums = new int[]{123,3,43,65,3,23};
        boolean flag = match.isDoubleNum(nums);
        System.out.println(flag);
    }
}

class Match{
    public boolean isDoubleNum(int[] nums){
        boolean flag = Arrays.stream(nums).allMatch(x->x%2==0);
        return flag;
    }
}
