package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxedPriceQueryBuilderDsl  {
    public TaxedPriceQueryBuilderDsl() {
    }

    public static TaxedPriceQueryBuilderDsl of() {
        return new TaxedPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<TaxedPriceQueryBuilderDsl> totalNet(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalNet"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedPriceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedPriceQueryBuilderDsl> totalGross(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalGross"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedPriceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedPriceQueryBuilderDsl> taxPortions(
        Function<com.commercetools.api.predicates.query.cart.TaxPortionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxPortionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxPortions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxPortionQueryBuilderDsl.of())),
            TaxedPriceQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<TaxedPriceQueryBuilderDsl> taxPortions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxPortions")),
                p -> new CombinationQueryPredicate<>(p, TaxedPriceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TaxedPriceQueryBuilderDsl> totalTax(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalTax"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedPriceQueryBuilderDsl::of);
    }
    
    
}
