
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemAddedMessagePayloadQueryBuilderDsl {
    public OrderLineItemAddedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderLineItemAddedMessagePayloadQueryBuilderDsl of() {
        return new OrderLineItemAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessagePayloadQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            OrderLineItemAddedMessagePayloadQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemAddedMessagePayloadQueryBuilderDsl> addedQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessagePayloadQueryBuilderDsl::of));
    }
}
