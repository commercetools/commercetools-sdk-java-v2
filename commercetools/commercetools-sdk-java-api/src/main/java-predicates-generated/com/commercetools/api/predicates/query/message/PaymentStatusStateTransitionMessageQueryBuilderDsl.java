package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentStatusStateTransitionMessageQueryBuilderDsl  {
    public PaymentStatusStateTransitionMessageQueryBuilderDsl() {
    }

    public static PaymentStatusStateTransitionMessageQueryBuilderDsl of() {
        return new PaymentStatusStateTransitionMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentStatusStateTransitionMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentStatusStateTransitionMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentStatusStateTransitionMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentStatusStateTransitionMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentStatusStateTransitionMessageQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<PaymentStatusStateTransitionMessageQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessageQueryBuilderDsl::of));
    }
    
}
