
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryAddedMessagePayloadQueryBuilderDsl {
    public DeliveryAddedMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryAddedMessagePayloadQueryBuilderDsl of() {
        return new DeliveryAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryAddedMessagePayloadQueryBuilderDsl> delivery(
            Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("delivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            DeliveryAddedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryAddedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryAddedMessagePayloadQueryBuilderDsl::of));
    }

}
