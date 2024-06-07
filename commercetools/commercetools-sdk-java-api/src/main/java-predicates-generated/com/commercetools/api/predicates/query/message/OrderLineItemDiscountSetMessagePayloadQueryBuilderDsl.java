
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl {
    public OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl of() {
        return new OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> taxedPricePortions(
            Function<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPricePortions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl.of())),
            OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl> taxedPricePortions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxedPricePortions")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

}
