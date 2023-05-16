
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl {
    public StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl of() {
        return new StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl> stagedChanges(
            Function<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stagedChanges"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl::of);
    }

}
