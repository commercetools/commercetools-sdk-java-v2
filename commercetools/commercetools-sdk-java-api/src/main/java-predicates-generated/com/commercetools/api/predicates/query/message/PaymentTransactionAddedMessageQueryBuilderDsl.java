
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentTransactionAddedMessageQueryBuilderDsl {
    public PaymentTransactionAddedMessageQueryBuilderDsl() {
    }

    public static PaymentTransactionAddedMessageQueryBuilderDsl of() {
        return new PaymentTransactionAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentTransactionAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentTransactionAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentTransactionAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentTransactionAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentTransactionAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentTransactionAddedMessageQueryBuilderDsl> transaction(
            Function<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("transaction"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl.of())),
            PaymentTransactionAddedMessageQueryBuilderDsl::of);
    }

}
