package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetParcelMeasurementsActionQueryBuilderDsl  {
    public OrderSetParcelMeasurementsActionQueryBuilderDsl() {
    }

    public static OrderSetParcelMeasurementsActionQueryBuilderDsl of() {
        return new OrderSetParcelMeasurementsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetParcelMeasurementsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelMeasurementsActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetParcelMeasurementsActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelMeasurementsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetParcelMeasurementsActionQueryBuilderDsl> measurements(
        Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("measurements"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            OrderSetParcelMeasurementsActionQueryBuilderDsl::of);
    }
    
    
}
