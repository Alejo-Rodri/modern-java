package modernjavainaction.chap02.print.strategy;

import modernjavainaction.chap02.Apple;
import modernjavainaction.chap02.ApplePrint;
import modernjavainaction.chap02.FilteringApples;

import java.util.Arrays;
import java.util.List;

public class ApplePrettyPrint implements ApplePrint {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, FilteringApples.Color.GREEN),
                new Apple(155, FilteringApples.Color.GREEN),
                new Apple(120, FilteringApples.Color.RED)
        );

        ApplePrint print = new ApplePrettyPrint();
        prettyPrintApple(inventory, print);
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePrint p) {
        String output;
        for (Apple apple : inventory) {
            output = p.print(apple);
            System.out.println(output);
        }
    }

    @Override
    public String print(Apple apple) {
        return apple.toString();
    }
}
