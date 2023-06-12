
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValidUntilSetMessageQueryBuilderDsl {
    public StandalonePriceValidUntilSetMessageQueryBuilderDsl() {
    }

    public static StandalonePriceValidUntilSetMessageQueryBuilderDsl of() {
        return new StandalonePriceValidUntilSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidUntilSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceValidUntilSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceValidUntilSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceValidUntilSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidUntilSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceValidUntilSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidUntilSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceValidUntilSetMessageQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessageQueryBuilderDsl> previousValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessageQueryBuilderDsl::of));
    }

}
