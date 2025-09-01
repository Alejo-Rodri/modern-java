package modernjavainaction.chap02.filter.strategy;

import modernjavainaction.chap02.Apple;
import modernjavainaction.chap02.ApplePredicate;
import modernjavainaction.chap02.FilteringApples;

public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == FilteringApples.Color.GREEN;
    }
}
