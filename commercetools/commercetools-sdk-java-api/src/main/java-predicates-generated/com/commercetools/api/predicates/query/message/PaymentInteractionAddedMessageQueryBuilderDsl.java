package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentInteractionAddedMessageQueryBuilderDsl  {
    public PaymentInteractionAddedMessageQueryBuilderDsl() {
    }

    public static PaymentInteractionAddedMessageQueryBuilderDsl of() {
        return new PaymentInteractionAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentInteractionAddedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentInteractionAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentInteractionAddedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentInteractionAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentInteractionAddedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentInteractionAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentInteractionAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentInteractionAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentInteractionAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentInteractionAddedMessageQueryBuilderDsl> interaction(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("interaction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentInteractionAddedMessageQueryBuilderDsl::of);
    }
    
    
}
