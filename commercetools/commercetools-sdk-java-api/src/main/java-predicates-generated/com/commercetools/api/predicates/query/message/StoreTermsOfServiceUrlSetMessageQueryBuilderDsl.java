
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreTermsOfServiceUrlSetMessageQueryBuilderDsl {
    public StoreTermsOfServiceUrlSetMessageQueryBuilderDsl() {
    }

    public static StoreTermsOfServiceUrlSetMessageQueryBuilderDsl of() {
        return new StoreTermsOfServiceUrlSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StoreTermsOfServiceUrlSetMessageQueryBuilderDsl> termsOfServiceUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("termsOfServiceUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreTermsOfServiceUrlSetMessageQueryBuilderDsl::of));
    }

}
