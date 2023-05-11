
package com.commercetools.api.predicates;

public interface BinaryPredicate<T extends Predicate> extends Predicate {
    public T left();

    public T right();

    public String operator();

}
