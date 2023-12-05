
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentDraftQueryBuilderDsl {
    public PaymentDraftQueryBuilderDsl() {
    }

    public static PaymentDraftQueryBuilderDsl of() {
        return new PaymentDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentDraftQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, PaymentDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentDraftQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> amountPlanned(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("amountPlanned"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> paymentMethodInfo(
            Function<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethodInfo"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> paymentStatus(
            Function<com.commercetools.api.predicates.query.payment.PaymentStatusDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentStatusDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentStatus"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment.PaymentStatusDraftQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> transactions(
            Function<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("transactions"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentDraftQueryBuilderDsl> transactions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactions")),
            p -> new CombinationQueryPredicate<>(p, PaymentDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> interfaceInteractions(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("interfaceInteractions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentDraftQueryBuilderDsl> interfaceInteractions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceInteractions")),
            p -> new CombinationQueryPredicate<>(p, PaymentDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PaymentDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, PaymentDraftQueryBuilderDsl::of));
    }

}
