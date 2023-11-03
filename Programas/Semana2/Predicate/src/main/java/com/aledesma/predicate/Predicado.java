package com.aledesma.predicate;

@FunctionalInterface
public interface Predicado<T> {

    boolean test(T t1,T t2);
}
