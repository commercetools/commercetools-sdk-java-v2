
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceTierAddedMessageQueryBuilderDsl {
    public StandalonePriceTierAddedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceTierAddedMessageQueryBuilderDsl of() {
        return new StandalonePriceTierAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceTierAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessageQueryBuilderDsl> tier(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tier"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessageQueryBuilderDsl::of);
    }

}
