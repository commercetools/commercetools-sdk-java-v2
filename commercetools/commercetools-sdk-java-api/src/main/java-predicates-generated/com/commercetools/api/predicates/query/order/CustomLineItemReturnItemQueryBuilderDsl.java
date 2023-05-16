
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemReturnItemQueryBuilderDsl {
    public CustomLineItemReturnItemQueryBuilderDsl() {
    }

    public static CustomLineItemReturnItemQueryBuilderDsl of() {
        return new CustomLineItemReturnItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemReturnItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CustomLineItemReturnItemQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemReturnItemQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemReturnItemQueryBuilderDsl::of));
    }

}
