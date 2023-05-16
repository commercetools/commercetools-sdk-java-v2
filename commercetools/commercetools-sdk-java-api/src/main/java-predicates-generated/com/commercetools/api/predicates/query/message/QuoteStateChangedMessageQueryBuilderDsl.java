
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteStateChangedMessageQueryBuilderDsl {
    public QuoteStateChangedMessageQueryBuilderDsl() {
    }

    public static QuoteStateChangedMessageQueryBuilderDsl of() {
        return new QuoteStateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteStateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteStateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteStateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteStateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteStateChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> quoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteState")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteStateChangedMessageQueryBuilderDsl> oldQuoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldQuoteState")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateChangedMessageQueryBuilderDsl::of));
    }

}
