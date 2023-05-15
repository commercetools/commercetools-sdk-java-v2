
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnItemQueryBuilderDsl {
    public ReturnItemQueryBuilderDsl() {
    }

    public static ReturnItemQueryBuilderDsl of() {
        return new ReturnItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ReturnItemQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReturnItemQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReturnItemQueryBuilderDsl::of));
    }
}
