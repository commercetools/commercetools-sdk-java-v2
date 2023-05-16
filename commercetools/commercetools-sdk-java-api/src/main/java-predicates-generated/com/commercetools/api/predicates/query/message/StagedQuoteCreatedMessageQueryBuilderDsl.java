
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteCreatedMessageQueryBuilderDsl {
    public StagedQuoteCreatedMessageQueryBuilderDsl() {
    }

    public static StagedQuoteCreatedMessageQueryBuilderDsl of() {
        return new StagedQuoteCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedQuoteCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedQuoteCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StagedQuoteCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StagedQuoteCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteCreatedMessageQueryBuilderDsl> stagedQuote(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stagedQuote"))
                .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl.of())),
            StagedQuoteCreatedMessageQueryBuilderDsl::of);
    }

}
