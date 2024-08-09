
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
