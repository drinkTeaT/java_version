package java8.lambda.collect;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2018-11-11 15:57
 **/
public class StreamCollect {
    public static void main(String[] args){
        Meat mutton = new Meat("mutton",22);
        Meat beaf = new Meat("beaf",40);
        Meat pork = new Meat("pork",14);
        Meat[] meats = new Meat[]{mutton,beaf,pork};
        Strategy strategy = new Strategy();
        String highPrice = strategy.getMaxPriceMeat(meats);
        String lowPrice = strategy.getMinPriceMeat(meats);
        Map<Integer, List<Meat>> map = strategy.groupByPrice(meats);
        System.out.println(highPrice+"\t"+lowPrice+"\n"+map);
    }
}

class Meat{
    String name;
    int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Meat(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class Strategy{
    public String getMaxPriceMeat(Meat[] meats){
        Optional<Meat> maxPrice = Arrays.stream(meats).collect(Collectors.maxBy(Comparator.comparing(Meat::getPrice)));
        return maxPrice.get().getName();
    }

    public String getMinPriceMeat(Meat[] meats){
        Optional<Meat> minPrice = Arrays.stream(meats).collect(Collectors.minBy(Comparator.comparingInt(Meat::getPrice)));
        return minPrice.get().getName();
    }

    public int getMultiplyPrice(Meat[] meats){
        int value = Arrays.stream(meats).collect(Collectors.reducing(0,Meat::getPrice,(x,y)->x*y));
        return value;
    }

    /**
     * 根据价格分组
     * @param meats
     * @return
     */
    public Map<Integer, List<Meat>> groupByPrice(Meat[] meats){
        Map<Integer, List<Meat>> map = Arrays.stream(meats).collect(Collectors.groupingBy(Meat::getPrice));
        return map;
    }
}
