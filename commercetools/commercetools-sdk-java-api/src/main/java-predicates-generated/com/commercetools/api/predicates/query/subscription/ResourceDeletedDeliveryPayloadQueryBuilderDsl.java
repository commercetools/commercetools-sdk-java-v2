package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ResourceDeletedDeliveryPayloadQueryBuilderDsl  {
    public ResourceDeletedDeliveryPayloadQueryBuilderDsl() {
    }

    public static ResourceDeletedDeliveryPayloadQueryBuilderDsl of() {
        return new ResourceDeletedDeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceDeletedDeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
        p -> new CombinationQueryPredicate<>(p, ResourceDeletedDeliveryPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ResourceDeletedDeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
        p -> new CombinationQueryPredicate<>(p, ResourceDeletedDeliveryPayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ResourceDeletedDeliveryPayloadQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ResourceDeletedDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ResourceDeletedDeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ResourceDeletedDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ResourceDeletedDeliveryPayloadQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ResourceDeletedDeliveryPayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ResourceDeletedDeliveryPayloadQueryBuilderDsl> modifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("modifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ResourceDeletedDeliveryPayloadQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ResourceDeletedDeliveryPayloadQueryBuilderDsl> dataErasure() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dataErasure")),
        p -> new CombinationQueryPredicate<>(p, ResourceDeletedDeliveryPayloadQueryBuilderDsl::of));
    }
    
}
