
package com.commercetools.api.predicates.query;

import java.util.function.Function;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.Builder;

public class CombinationQueryPredicate<T> implements QueryPredicate, Builder<QueryPredicate> {
    private final QueryPredicate predicate;

    private final Supplier<T> modelSupplier;

    public CombinationQueryPredicate(final QueryPredicate predicate, final Supplier<T> modelSupplier) {
        this.predicate = predicate;
        this.modelSupplier = modelSupplier;
    }

    /**
     * combines the previous predicate with the argument predicate by an AND operator
     * @param fn predicate builder function
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> and(final Function<T, CombinationQueryPredicate<T>> fn) {
        return new CombinationQueryPredicate<>(
            BinaryQueryPredicate.of().left(predicate).right(fn.apply(modelSupplier.get())).operator("and"),
            modelSupplier);
    }

    /**
     * combines the previous predicate with the argument predicate by an AND operator
     * @param second predicate
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> and(final CombinationQueryPredicate<T> second) {
        return new CombinationQueryPredicate<>(BinaryQueryPredicate.of().left(predicate).right(second).operator("and"),
            modelSupplier);
    }

    /**
     * combines the previous predicate with the argument predicate by an OR operator
     * @param fn predicate builder function
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> or(final Function<T, CombinationQueryPredicate<T>> fn) {
        return new CombinationQueryPredicate<>(
            BinaryQueryPredicate.of().left(predicate).right(fn.apply(modelSupplier.get())).operator("or"),
            modelSupplier);
    }

    /**
     * combines the previous predicate with the argument predicate by an OR operator
     * @param second predicate
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> or(final CombinationQueryPredicate<T> second) {
        return new CombinationQueryPredicate<>(BinaryQueryPredicate.of().left(predicate).right(second).operator("or"),
            modelSupplier);
    }

    /**
     * puts the resulting predicate in parentheses
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> group() {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of().inner(predicate), modelSupplier);
    }

    /**
     * negates the previous predicate with the NOT predicate
     * @return a combination predicate
     */
    public CombinationQueryPredicate<T> not() {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of().parent(ConstantQueryPredicate.of().constant("not")).inner(predicate),
            modelSupplier);
    }

    @Override
    public String render() {
        return predicate.render();
    }

    @Override
    public QueryPredicate build() {
        return predicate;
    }
}
