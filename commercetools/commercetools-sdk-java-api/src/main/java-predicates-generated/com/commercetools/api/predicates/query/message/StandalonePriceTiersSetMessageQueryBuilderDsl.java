
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceTiersSetMessageQueryBuilderDsl {
    public StandalonePriceTiersSetMessageQueryBuilderDsl() {
    }

    public static StandalonePriceTiersSetMessageQueryBuilderDsl of() {
        return new StandalonePriceTiersSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessageQueryBuilderDsl> previousTiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("previousTiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceTiersSetMessageQueryBuilderDsl> previousTiers() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessageQueryBuilderDsl::of));
    }

}
