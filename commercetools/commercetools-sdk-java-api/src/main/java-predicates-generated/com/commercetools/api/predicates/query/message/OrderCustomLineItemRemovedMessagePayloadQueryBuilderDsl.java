
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl {
    public OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl> customLineItem(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItem"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
