package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentQueryBuilderDsl  {
    public PaymentQueryBuilderDsl() {
    }

    public static PaymentQueryBuilderDsl of() {
        return new PaymentQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PaymentQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PaymentQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> amountPlanned(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amountPlanned"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> amountAuthorized(
        Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amountAuthorized"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> authorizedUntil() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authorizedUntil")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> amountPaid(
        Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amountPaid"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> amountRefunded(
        Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amountRefunded"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> paymentMethodInfo(
        Function<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("paymentMethodInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> paymentStatus(
        Function<com.commercetools.api.predicates.query.payment.PaymentStatusQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentStatusQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("paymentStatus"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentStatusQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> transactions(
        Function<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transactions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<PaymentQueryBuilderDsl> transactions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactions")),
                p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> interfaceInteractions(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("interfaceInteractions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<PaymentQueryBuilderDsl> interfaceInteractions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceInteractions")),
                p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<PaymentQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, PaymentQueryBuilderDsl::of));
    }
    
}
