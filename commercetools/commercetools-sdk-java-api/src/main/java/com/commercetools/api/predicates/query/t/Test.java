
package com.commercetools.api.predicates.query.t;

import java.util.*;
import java.util.function.Function;

interface Functor<T, F extends Functor<?, ?>> {
    <R> F map(Function<T, R> f);
}

class Identity<T> implements Functor<T, Identity<?>> {

    private final T value;

    Identity(T value) {
        this.value = value;
    }

    public <R> Identity<R> map(Function<T, R> f) {
        final R result = f.apply(value);
        return new Identity<>(result);
    }
}

class FOptional<T> implements Functor<T, FOptional<?>> {

    private final T valueOrNull;

    private FOptional(T valueOrNull) {
        this.valueOrNull = valueOrNull;
    }

    public <R> FOptional<R> map(Function<T, R> f) {
        if (valueOrNull == null)
            return empty();
        else
            return of(f.apply(valueOrNull));
    }

    public static <T> FOptional<T> of(T a) {
        return new FOptional<T>(a);
    }

    public static <T> FOptional<T> empty() {
        return new FOptional<T>(null);
    }
}

class FList<T> implements Functor<T, FList<?>> {

    private final List<T> list;

    FList(Iterable<T> value) {
        this.list = new ArrayList<>((Collection<T>) value);
    }

    @Override
    public <R> FList<?> map(Function<T, R> f) {
        ArrayList<R> result = new ArrayList<R>(list.size());
        for (T t : list) {
            result.add(f.apply(t));
        }
        return new FList<>(result);
    }
}

interface Monad<T, M extends Monad<?, ?>> extends Functor<T, M> {
    M flatMap(Function<T, M> f);
}

//class CartQuery {
//    public LineItemQuery lineItems() { return null; }
//}
//
//class LineItemQuery {
//    public String id() { return null; }
//}
//
//class T {
//    public void t() {
//        new Identity<>(new CartQuery())
//                .map(CartQuery::lineItems)
//                .map(LineItemQuery::id);
//
//    }
//}
