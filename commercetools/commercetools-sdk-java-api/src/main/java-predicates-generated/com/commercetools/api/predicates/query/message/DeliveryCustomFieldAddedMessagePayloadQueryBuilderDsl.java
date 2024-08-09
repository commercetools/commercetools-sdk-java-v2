
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl {
    public DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl of() {
        return new DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

}
