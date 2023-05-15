
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DeliveryPayloadQueryBuilderDsl {
    public DeliveryPayloadQueryBuilderDsl() {
    }

    public static DeliveryPayloadQueryBuilderDsl of() {
        return new DeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
            p -> new CombinationQueryPredicate<>(p, DeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, DeliveryPayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DeliveryPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DeliveryPayloadQueryBuilderDsl::of);
    }

}
