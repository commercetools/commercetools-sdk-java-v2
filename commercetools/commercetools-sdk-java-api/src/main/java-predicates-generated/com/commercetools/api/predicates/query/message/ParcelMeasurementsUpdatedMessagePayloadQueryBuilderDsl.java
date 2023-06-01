package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl  {
    public ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl() {
    }

    public static ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl of() {
        return new ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl> measurements(
        Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("measurements"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsUpdatedMessagePayloadQueryBuilderDsl::of));
    }
    
}
