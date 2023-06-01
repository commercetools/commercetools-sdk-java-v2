package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxedItemPriceQueryBuilderDsl  {
    public TaxedItemPriceQueryBuilderDsl() {
    }

    public static TaxedItemPriceQueryBuilderDsl of() {
        return new TaxedItemPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<TaxedItemPriceQueryBuilderDsl> totalNet(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalNet"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedItemPriceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedItemPriceQueryBuilderDsl> totalGross(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalGross"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedItemPriceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedItemPriceQueryBuilderDsl> totalTax(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalTax"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxedItemPriceQueryBuilderDsl::of);
    }
    
    
}
