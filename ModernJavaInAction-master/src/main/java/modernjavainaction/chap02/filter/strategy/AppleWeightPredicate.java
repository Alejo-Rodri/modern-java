package modernjavainaction.chap02.filter.strategy;

import modernjavainaction.chap02.Apple;
import modernjavainaction.chap02.ApplePredicate;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
