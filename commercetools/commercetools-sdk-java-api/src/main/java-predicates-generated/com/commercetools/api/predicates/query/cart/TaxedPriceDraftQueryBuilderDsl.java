package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxedPriceDraftQueryBuilderDsl  {
    public TaxedPriceDraftQueryBuilderDsl() {
    }

    public static TaxedPriceDraftQueryBuilderDsl of() {
        return new TaxedPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<TaxedPriceDraftQueryBuilderDsl> totalNet(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalNet"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedPriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedPriceDraftQueryBuilderDsl> totalGross(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalGross"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedPriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedPriceDraftQueryBuilderDsl> taxPortions(
        Function<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxPortions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl.of())),
            TaxedPriceDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<TaxedPriceDraftQueryBuilderDsl> taxPortions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxPortions")),
                p -> new CombinationQueryPredicate<>(p, TaxedPriceDraftQueryBuilderDsl::of));
    }
    
}
