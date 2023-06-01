package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteDraftQueryBuilderDsl  {
    public StagedQuoteDraftQueryBuilderDsl() {
    }

    public static StagedQuoteDraftQueryBuilderDsl of() {
        return new StagedQuoteDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<StagedQuoteDraftQueryBuilderDsl> quoteRequest(
        Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quoteRequest"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestResourceIdentifierQueryBuilderDsl.of())),
            StagedQuoteDraftQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StagedQuoteDraftQueryBuilderDsl> quoteRequestVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestVersion")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<StagedQuoteDraftQueryBuilderDsl> quoteRequestStateToAccepted() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteRequestStateToAccepted")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StagedQuoteDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedQuoteDraftQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            StagedQuoteDraftQueryBuilderDsl::of);
    }
    
    
}
