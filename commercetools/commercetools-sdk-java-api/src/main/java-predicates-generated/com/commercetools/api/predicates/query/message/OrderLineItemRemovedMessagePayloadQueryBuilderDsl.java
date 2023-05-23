
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemRemovedMessagePayloadQueryBuilderDsl {
    public OrderLineItemRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderLineItemRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderLineItemRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> removedQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newState(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newState() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newState")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newTotalPrice(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("newTotalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newTaxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newTaxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemRemovedMessagePayloadQueryBuilderDsl> newShippingDetail(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("newShippingDetail"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl.of())),
            OrderLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
