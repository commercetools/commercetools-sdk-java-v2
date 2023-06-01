package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentTransactionStateChangedMessageQueryBuilderDsl  {
    public PaymentTransactionStateChangedMessageQueryBuilderDsl() {
    }

    public static PaymentTransactionStateChangedMessageQueryBuilderDsl of() {
        return new PaymentTransactionStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentTransactionStateChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentTransactionStateChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentTransactionStateChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentTransactionStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentTransactionStateChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentTransactionStateChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentTransactionStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentTransactionStateChangedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessageQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessageQueryBuilderDsl::of));
    }
    
}
