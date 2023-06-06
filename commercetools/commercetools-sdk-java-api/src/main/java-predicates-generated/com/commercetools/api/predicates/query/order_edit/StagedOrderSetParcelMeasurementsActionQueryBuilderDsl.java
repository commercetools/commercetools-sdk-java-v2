
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetParcelMeasurementsActionQueryBuilderDsl {
    public StagedOrderSetParcelMeasurementsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetParcelMeasurementsActionQueryBuilderDsl of() {
        return new StagedOrderSetParcelMeasurementsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelMeasurementsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelMeasurementsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelMeasurementsActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelMeasurementsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetParcelMeasurementsActionQueryBuilderDsl> parcelKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetParcelMeasurementsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetParcelMeasurementsActionQueryBuilderDsl> measurements(
            Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("measurements"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            StagedOrderSetParcelMeasurementsActionQueryBuilderDsl::of);
    }

}
