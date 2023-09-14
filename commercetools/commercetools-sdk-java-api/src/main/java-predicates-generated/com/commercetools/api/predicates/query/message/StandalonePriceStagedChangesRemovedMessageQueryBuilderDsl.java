
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl {
    public StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl of() {
        return new StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl> stagedChanges(
            Function<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stagedChanges"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl::of);
    }

}
