
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl {
    public PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl() {
    }

    public static PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl of() {
        return new PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl> oldStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStatus")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl::of));
    }

}
