package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderRemoveParcelFromDeliveryActionQueryBuilderDsl  {
    public OrderRemoveParcelFromDeliveryActionQueryBuilderDsl() {
    }

    public static OrderRemoveParcelFromDeliveryActionQueryBuilderDsl of() {
        return new OrderRemoveParcelFromDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderRemoveParcelFromDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderRemoveParcelFromDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderRemoveParcelFromDeliveryActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, OrderRemoveParcelFromDeliveryActionQueryBuilderDsl::of));
    }
    
}
