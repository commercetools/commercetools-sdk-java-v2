package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MessageDeliveryPayloadQueryBuilderDsl  {
    public MessageDeliveryPayloadQueryBuilderDsl() {
    }

    public static MessageDeliveryPayloadQueryBuilderDsl of() {
        return new MessageDeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MessageDeliveryPayloadQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            MessageDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MessageDeliveryPayloadQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            MessageDeliveryPayloadQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MessageDeliveryPayloadQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, MessageDeliveryPayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MessageDeliveryPayloadQueryBuilderDsl> payloadNotIncluded(
        Function<com.commercetools.api.predicates.query.subscription.PayloadNotIncludedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.PayloadNotIncludedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payloadNotIncluded"))
            .inner(fn.apply(com.commercetools.api.predicates.query.subscription.PayloadNotIncludedQueryBuilderDsl.of())),
            MessageDeliveryPayloadQueryBuilderDsl::of);
    }
    
    
}
