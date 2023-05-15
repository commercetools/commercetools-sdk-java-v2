
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl {
    public OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p,
                OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl> oldQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuantity")),
            p -> new CombinationQueryPredicate<>(p,
                OrderCustomLineItemQuantityChangedMessagePayloadQueryBuilderDsl::of));
    }
}
