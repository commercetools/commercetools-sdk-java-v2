
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl {
    public ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl() {
    }

    public static ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl of() {
        return new ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl> delivery(
            Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("delivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl> parcel(
            Function<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("parcel"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl.of())),
            ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelAddedToDeliveryMessagePayloadQueryBuilderDsl::of));
    }
}
