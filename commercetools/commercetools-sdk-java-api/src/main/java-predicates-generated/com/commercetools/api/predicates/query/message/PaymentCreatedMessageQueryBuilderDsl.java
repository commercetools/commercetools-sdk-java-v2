package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentCreatedMessageQueryBuilderDsl  {
    public PaymentCreatedMessageQueryBuilderDsl() {
    }

    public static PaymentCreatedMessageQueryBuilderDsl of() {
        return new PaymentCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentCreatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentCreatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentCreatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentCreatedMessageQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl.of())),
            PaymentCreatedMessageQueryBuilderDsl::of);
    }
    
    
}
