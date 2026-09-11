
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantStagedChangesRemovedMessageQueryBuilderDsl {
    public VariantStagedChangesRemovedMessageQueryBuilderDsl() {
    }

    public static VariantStagedChangesRemovedMessageQueryBuilderDsl of() {
        return new VariantStagedChangesRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantStagedChangesRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            VariantStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantStagedChangesRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            VariantStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantStagedChangesRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            VariantStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantStagedChangesRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantStagedChangesRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            VariantStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

}
