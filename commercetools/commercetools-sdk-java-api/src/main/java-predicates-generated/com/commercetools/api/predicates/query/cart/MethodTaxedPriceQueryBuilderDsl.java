package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MethodTaxedPriceQueryBuilderDsl  {
    public MethodTaxedPriceQueryBuilderDsl() {
    }

    public static MethodTaxedPriceQueryBuilderDsl of() {
        return new MethodTaxedPriceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MethodTaxedPriceQueryBuilderDsl> shippingMethodKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodKey")),
        p -> new CombinationQueryPredicate<>(p, MethodTaxedPriceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MethodTaxedPriceQueryBuilderDsl> taxedPrice(
        Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            MethodTaxedPriceQueryBuilderDsl::of);
    }
    
    
}
