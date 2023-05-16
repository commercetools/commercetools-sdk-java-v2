
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnInfoQueryBuilderDsl {
    public ReturnInfoQueryBuilderDsl() {
    }

    public static ReturnInfoQueryBuilderDsl of() {
        return new ReturnInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ReturnInfoQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.ReturnItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnItemQueryBuilderDsl.of())),
            ReturnInfoQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ReturnInfoQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnInfoQueryBuilderDsl> returnTrackingId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnTrackingId")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReturnInfoQueryBuilderDsl> returnDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnDate")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoQueryBuilderDsl::of));
    }

}
