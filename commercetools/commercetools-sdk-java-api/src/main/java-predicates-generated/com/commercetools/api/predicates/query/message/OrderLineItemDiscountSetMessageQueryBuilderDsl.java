
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemDiscountSetMessageQueryBuilderDsl {
    public OrderLineItemDiscountSetMessageQueryBuilderDsl() {
    }

    public static OrderLineItemDiscountSetMessageQueryBuilderDsl of() {
        return new OrderLineItemDiscountSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessageQueryBuilderDsl> taxedPricePortions(
            Function<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPricePortions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderLineItemDiscountSetMessageQueryBuilderDsl> taxedPricePortions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxedPricePortions")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessageQueryBuilderDsl::of));
    }

}
