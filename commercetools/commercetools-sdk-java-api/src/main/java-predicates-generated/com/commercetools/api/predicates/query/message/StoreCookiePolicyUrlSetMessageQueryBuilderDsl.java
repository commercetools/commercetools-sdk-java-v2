
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreCookiePolicyUrlSetMessageQueryBuilderDsl {
    public StoreCookiePolicyUrlSetMessageQueryBuilderDsl() {
    }

    public static StoreCookiePolicyUrlSetMessageQueryBuilderDsl of() {
        return new StoreCookiePolicyUrlSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StoreCookiePolicyUrlSetMessageQueryBuilderDsl> cookiePolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cookiePolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreCookiePolicyUrlSetMessageQueryBuilderDsl::of));
    }

}
