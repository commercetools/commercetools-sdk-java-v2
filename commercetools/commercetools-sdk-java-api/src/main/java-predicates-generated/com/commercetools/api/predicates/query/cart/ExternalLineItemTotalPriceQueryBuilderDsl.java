package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExternalLineItemTotalPriceQueryBuilderDsl  {
    public ExternalLineItemTotalPriceQueryBuilderDsl() {
    }

    public static ExternalLineItemTotalPriceQueryBuilderDsl of() {
        return new ExternalLineItemTotalPriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ExternalLineItemTotalPriceQueryBuilderDsl> price(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("price"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ExternalLineItemTotalPriceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ExternalLineItemTotalPriceQueryBuilderDsl> totalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ExternalLineItemTotalPriceQueryBuilderDsl::of);
    }
    
    
}
