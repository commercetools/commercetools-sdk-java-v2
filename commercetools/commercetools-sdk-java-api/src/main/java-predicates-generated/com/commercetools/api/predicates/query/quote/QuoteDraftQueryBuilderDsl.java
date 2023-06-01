package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteDraftQueryBuilderDsl  {
    public QuoteDraftQueryBuilderDsl() {
    }

    public static QuoteDraftQueryBuilderDsl of() {
        return new QuoteDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, QuoteDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteDraftQueryBuilderDsl> stagedQuote(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedQuote"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteResourceIdentifierQueryBuilderDsl.of())),
            QuoteDraftQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteDraftQueryBuilderDsl> stagedQuoteVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteVersion")),
        p -> new CombinationQueryPredicate<>(p, QuoteDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<QuoteDraftQueryBuilderDsl> stagedQuoteStateToSent() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteStateToSent")),
        p -> new CombinationQueryPredicate<>(p, QuoteDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteDraftQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            QuoteDraftQueryBuilderDsl::of);
    }
    
    
}
