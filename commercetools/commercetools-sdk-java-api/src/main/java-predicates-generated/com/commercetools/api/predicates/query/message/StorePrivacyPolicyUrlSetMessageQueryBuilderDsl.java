
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StorePrivacyPolicyUrlSetMessageQueryBuilderDsl {
    public StorePrivacyPolicyUrlSetMessageQueryBuilderDsl() {
    }

    public static StorePrivacyPolicyUrlSetMessageQueryBuilderDsl of() {
        return new StorePrivacyPolicyUrlSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StorePrivacyPolicyUrlSetMessageQueryBuilderDsl> privacyPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("privacyPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorePrivacyPolicyUrlSetMessageQueryBuilderDsl::of));
    }

}
