
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestCreatedMessageQueryBuilderDsl {
    public QuoteRequestCreatedMessageQueryBuilderDsl() {
    }

    public static QuoteRequestCreatedMessageQueryBuilderDsl of() {
        return new QuoteRequestCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRequestCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRequestCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteRequestCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteRequestCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestCreatedMessageQueryBuilderDsl> quoteRequest(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("quoteRequest"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of())),
            QuoteRequestCreatedMessageQueryBuilderDsl::of);
    }

}
