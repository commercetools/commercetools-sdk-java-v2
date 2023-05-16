
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceCreatedMessageQueryBuilderDsl {
    public StandalonePriceCreatedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceCreatedMessageQueryBuilderDsl of() {
        return new StandalonePriceCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessageQueryBuilderDsl> standalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("standalonePrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl.of())),
            StandalonePriceCreatedMessageQueryBuilderDsl::of);
    }

}
