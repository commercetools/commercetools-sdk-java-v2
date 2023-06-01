package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DeliveryRemovedMessagePayloadQueryBuilderDsl  {
    public DeliveryRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryRemovedMessagePayloadQueryBuilderDsl of() {
        return new DeliveryRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DeliveryRemovedMessagePayloadQueryBuilderDsl> delivery(
        Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("delivery"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            DeliveryRemovedMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<DeliveryRemovedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, DeliveryRemovedMessagePayloadQueryBuilderDsl::of));
    }
    
}
