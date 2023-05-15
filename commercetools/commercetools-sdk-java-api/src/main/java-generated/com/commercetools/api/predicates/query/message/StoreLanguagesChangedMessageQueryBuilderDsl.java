
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreLanguagesChangedMessageQueryBuilderDsl {
    public StoreLanguagesChangedMessageQueryBuilderDsl() {
    }

    public static StoreLanguagesChangedMessageQueryBuilderDsl of() {
        return new StoreLanguagesChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreLanguagesChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreLanguagesChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreLanguagesChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreLanguagesChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreLanguagesChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreLanguagesChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreLanguagesChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreLanguagesChangedMessageQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> addedLanguages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedLanguages")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<StoreLanguagesChangedMessageQueryBuilderDsl> removedLanguages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedLanguages")),
            p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessageQueryBuilderDsl::of));
    }
}
