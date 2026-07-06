
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl {
    public PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl() {
    }

    public static PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl of() {
        return new PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> newInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl> oldInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessageQueryBuilderDsl::of));
    }

}
