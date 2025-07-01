
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentInterfaceIdSetMessageQueryBuilderDsl {
    public PaymentInterfaceIdSetMessageQueryBuilderDsl() {
    }

    public static PaymentInterfaceIdSetMessageQueryBuilderDsl of() {
        return new PaymentInterfaceIdSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentInterfaceIdSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentInterfaceIdSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentInterfaceIdSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentInterfaceIdSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentInterfaceIdSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessageQueryBuilderDsl> oldInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessageQueryBuilderDsl::of));
    }

}
