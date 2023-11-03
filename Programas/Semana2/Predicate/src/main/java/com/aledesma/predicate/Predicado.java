package com.aledesma.predicate;
//Interface funcional de tipo predicate con 2 parámetros de tipo T usando generics
@FunctionalInterface
public interface Predicado<T> {

    boolean test(T t1,T t2);
}
