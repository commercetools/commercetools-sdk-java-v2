
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreRefundPolicyUrlSetMessageQueryBuilderDsl {
    public StoreRefundPolicyUrlSetMessageQueryBuilderDsl() {
    }

    public static StoreRefundPolicyUrlSetMessageQueryBuilderDsl of() {
        return new StoreRefundPolicyUrlSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessageQueryBuilderDsl> refundPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refundPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessageQueryBuilderDsl::of));
    }

}
