package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestStateTransitionMessageQueryBuilderDsl  {
    public QuoteRequestStateTransitionMessageQueryBuilderDsl() {
    }

    public static QuoteRequestStateTransitionMessageQueryBuilderDsl of() {
        return new QuoteRequestStateTransitionMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestStateTransitionMessageQueryBuilderDsl> oldState(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldState"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<QuoteRequestStateTransitionMessageQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessageQueryBuilderDsl::of));
    }
    
}
