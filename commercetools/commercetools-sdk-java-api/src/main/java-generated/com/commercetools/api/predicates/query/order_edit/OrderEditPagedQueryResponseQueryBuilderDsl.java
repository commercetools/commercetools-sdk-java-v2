
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditPagedQueryResponseQueryBuilderDsl {
    public OrderEditPagedQueryResponseQueryBuilderDsl() {
    }

    public static OrderEditPagedQueryResponseQueryBuilderDsl of() {
        return new OrderEditPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderEditPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderEditPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderEditPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderEditPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl.of())),
            OrderEditPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderEditPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, OrderEditPagedQueryResponseQueryBuilderDsl::of));
    }
}
