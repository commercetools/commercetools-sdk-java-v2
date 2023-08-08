
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl {
    public OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderCustomLineItemDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

}
