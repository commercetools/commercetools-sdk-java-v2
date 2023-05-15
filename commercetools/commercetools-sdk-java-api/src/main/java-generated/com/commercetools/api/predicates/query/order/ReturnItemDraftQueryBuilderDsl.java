
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnItemDraftQueryBuilderDsl {
    public ReturnItemDraftQueryBuilderDsl() {
    }

    public static ReturnItemDraftQueryBuilderDsl of() {
        return new ReturnItemDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ReturnItemDraftQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemDraftQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemDraftQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemDraftQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemDraftQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnItemDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ReturnItemDraftQueryBuilderDsl::of);
    }

}
