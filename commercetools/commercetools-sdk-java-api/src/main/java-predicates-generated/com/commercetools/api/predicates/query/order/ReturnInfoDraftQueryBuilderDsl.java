
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnInfoDraftQueryBuilderDsl {
    public ReturnInfoDraftQueryBuilderDsl() {
    }

    public static ReturnInfoDraftQueryBuilderDsl of() {
        return new ReturnInfoDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ReturnInfoDraftQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl.of())),
            ReturnInfoDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ReturnInfoDraftQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnInfoDraftQueryBuilderDsl> returnTrackingId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnTrackingId")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReturnInfoDraftQueryBuilderDsl> returnDate() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnDate")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoDraftQueryBuilderDsl::of));
    }

}
