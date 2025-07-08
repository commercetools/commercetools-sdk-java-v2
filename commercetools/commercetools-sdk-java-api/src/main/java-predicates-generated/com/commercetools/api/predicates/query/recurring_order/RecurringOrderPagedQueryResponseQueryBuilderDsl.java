
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderPagedQueryResponseQueryBuilderDsl {
    public RecurringOrderPagedQueryResponseQueryBuilderDsl() {
    }

    public static RecurringOrderPagedQueryResponseQueryBuilderDsl of() {
        return new RecurringOrderPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<RecurringOrderPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl.of())),
            RecurringOrderPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringOrderPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderPagedQueryResponseQueryBuilderDsl::of));
    }

}
