
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryAddressSetMessagePayloadQueryBuilderDsl {
    public DeliveryAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryAddressSetMessagePayloadQueryBuilderDsl of() {
        return new DeliveryAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryAddressSetMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            DeliveryAddressSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryAddressSetMessagePayloadQueryBuilderDsl> oldAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            DeliveryAddressSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryAddressSetMessagePayloadQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryAddressSetMessagePayloadQueryBuilderDsl::of));
    }

}
