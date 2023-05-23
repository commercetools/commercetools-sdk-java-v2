
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemReturnItemQueryBuilderDsl {
    public LineItemReturnItemQueryBuilderDsl() {
    }

    public static LineItemReturnItemQueryBuilderDsl of() {
        return new LineItemReturnItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemReturnItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            LineItemReturnItemQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemReturnItemQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, LineItemReturnItemQueryBuilderDsl::of));
    }

}
