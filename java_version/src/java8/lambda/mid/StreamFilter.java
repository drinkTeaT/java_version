package java8.lambda.mid;

import java.util.Arrays;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-11 15:01
 **/
public class StreamFilter {
    public static void main(String[] args){
        String[] strings = new String[]{"12","gde","gejo4"};
        Filter lengthFilter = new Filter();
        lengthFilter.lengthFilter(strings);
    }
}

class Filter{
    public void lengthFilter(String[] strs){
        Arrays.stream(strs).filter(x->x.length()>2).forEach(System.out::println);
    }
}