
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl {
    public StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl() {
    }

    public static StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl of() {
        return new StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> previousValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl> previousValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl::of));
    }

}
