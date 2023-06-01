package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestDraftQueryBuilderDsl  {
    public QuoteRequestDraftQueryBuilderDsl() {
    }

    public static QuoteRequestDraftQueryBuilderDsl of() {
        return new QuoteRequestDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<QuoteRequestDraftQueryBuilderDsl> cart(
        Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("cart"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            QuoteRequestDraftQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteRequestDraftQueryBuilderDsl> cartVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartVersion")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestDraftQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            QuoteRequestDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestDraftQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<QuoteRequestDraftQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestDraftQueryBuilderDsl::of));
    }
    
}
