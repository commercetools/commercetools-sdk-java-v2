
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestStateChangedMessageQueryBuilderDsl {
    public QuoteRequestStateChangedMessageQueryBuilderDsl() {
    }

    public static QuoteRequestStateChangedMessageQueryBuilderDsl of() {
        return new QuoteRequestStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestStateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRequestStateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestStateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRequestStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestStateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteRequestStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteRequestStateChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> quoteRequestState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestState")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateChangedMessageQueryBuilderDsl> oldQuoteRequestState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuoteRequestState")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateChangedMessageQueryBuilderDsl::of));
    }

}
