
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl {
    public ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl() {
    }

    public static ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl of() {
        return new ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl> parcel(
            Function<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("parcel"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ParcelQueryBuilderDsl.of())),
            ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ParcelRemovedFromDeliveryMessagePayloadQueryBuilderDsl::of));
    }
}
