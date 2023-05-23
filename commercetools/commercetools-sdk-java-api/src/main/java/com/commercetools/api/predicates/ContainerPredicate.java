
package com.commercetools.api.predicates;

public interface ContainerPredicate<T extends Predicate> extends Predicate {
    public T parent();

    public T inner();

    boolean renderInnerWithOutParentheses();
}
