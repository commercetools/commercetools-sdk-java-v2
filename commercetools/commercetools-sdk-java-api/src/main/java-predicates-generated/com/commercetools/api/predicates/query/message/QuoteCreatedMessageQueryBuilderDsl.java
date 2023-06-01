package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteCreatedMessageQueryBuilderDsl  {
    public QuoteCreatedMessageQueryBuilderDsl() {
    }

    public static QuoteCreatedMessageQueryBuilderDsl of() {
        return new QuoteCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteCreatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteCreatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteCreatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, QuoteCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteCreatedMessageQueryBuilderDsl> quote(
        Function<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quote"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl.of())),
            QuoteCreatedMessageQueryBuilderDsl::of);
    }
    
    
}
