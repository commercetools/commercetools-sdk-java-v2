
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelQueryBuilderDsl {
    public ParcelQueryBuilderDsl() {
    }

    public static ParcelQueryBuilderDsl of() {
        return new ParcelQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ParcelQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ParcelQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ParcelQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelQueryBuilderDsl> measurements(
            Function<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("measurements"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelMeasurementsQueryBuilderDsl.of())),
            ParcelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelQueryBuilderDsl> trackingData(
            Function<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("trackingData"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.TrackingDataQueryBuilderDsl.of())),
            ParcelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelQueryBuilderDsl> items(
            Function<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("items"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryItemQueryBuilderDsl.of())),
            ParcelQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ParcelQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
            p -> new CombinationQueryPredicate<>(p, ParcelQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ParcelQueryBuilderDsl::of);
    }

}
