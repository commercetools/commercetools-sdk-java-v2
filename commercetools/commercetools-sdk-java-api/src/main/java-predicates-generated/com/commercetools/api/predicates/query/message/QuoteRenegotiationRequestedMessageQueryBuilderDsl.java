
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRenegotiationRequestedMessageQueryBuilderDsl {
    public QuoteRenegotiationRequestedMessageQueryBuilderDsl() {
    }

    public static QuoteRenegotiationRequestedMessageQueryBuilderDsl of() {
        return new QuoteRenegotiationRequestedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRenegotiationRequestedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRenegotiationRequestedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRenegotiationRequestedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRenegotiationRequestedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRenegotiationRequestedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteRenegotiationRequestedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRenegotiationRequestedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteRenegotiationRequestedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QuoteRenegotiationRequestedMessageQueryBuilderDsl> buyerComment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerComment")),
            p -> new CombinationQueryPredicate<>(p, QuoteRenegotiationRequestedMessageQueryBuilderDsl::of));
    }

}
