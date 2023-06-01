package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxedItemPriceDraftQueryBuilderDsl  {
    public TaxedItemPriceDraftQueryBuilderDsl() {
    }

    public static TaxedItemPriceDraftQueryBuilderDsl of() {
        return new TaxedItemPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<TaxedItemPriceDraftQueryBuilderDsl> totalNet(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalNet"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedItemPriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TaxedItemPriceDraftQueryBuilderDsl> totalGross(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalGross"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedItemPriceDraftQueryBuilderDsl::of);
    }
    
    
}
