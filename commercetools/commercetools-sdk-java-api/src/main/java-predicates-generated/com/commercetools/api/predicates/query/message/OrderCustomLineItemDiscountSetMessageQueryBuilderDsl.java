
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomLineItemDiscountSetMessageQueryBuilderDsl {
    public OrderCustomLineItemDiscountSetMessageQueryBuilderDsl() {
    }

    public static OrderCustomLineItemDiscountSetMessageQueryBuilderDsl of() {
        return new OrderCustomLineItemDiscountSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessageQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

}
