
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteStateChangedMessageQueryBuilderDsl {
    public StagedQuoteStateChangedMessageQueryBuilderDsl() {
    }

    public static StagedQuoteStateChangedMessageQueryBuilderDsl of() {
        return new StagedQuoteStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteStateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedQuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteStateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedQuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteStateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StagedQuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StagedQuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> stagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteState")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessageQueryBuilderDsl> oldStagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStagedQuoteState")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessageQueryBuilderDsl::of));
    }
}
