
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl {
    public DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl of() {
        return new DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, DeliveryCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
