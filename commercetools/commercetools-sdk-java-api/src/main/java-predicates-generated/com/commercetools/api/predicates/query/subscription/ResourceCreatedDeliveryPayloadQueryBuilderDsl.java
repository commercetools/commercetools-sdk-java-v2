package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ResourceCreatedDeliveryPayloadQueryBuilderDsl  {
    public ResourceCreatedDeliveryPayloadQueryBuilderDsl() {
    }

    public static ResourceCreatedDeliveryPayloadQueryBuilderDsl of() {
        return new ResourceCreatedDeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceCreatedDeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
        p -> new CombinationQueryPredicate<>(p, ResourceCreatedDeliveryPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ResourceCreatedDeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
        p -> new CombinationQueryPredicate<>(p, ResourceCreatedDeliveryPayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ResourceCreatedDeliveryPayloadQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ResourceCreatedDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ResourceCreatedDeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ResourceCreatedDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ResourceCreatedDeliveryPayloadQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ResourceCreatedDeliveryPayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ResourceCreatedDeliveryPayloadQueryBuilderDsl> modifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("modifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ResourceCreatedDeliveryPayloadQueryBuilderDsl::of));
    }
    
}
