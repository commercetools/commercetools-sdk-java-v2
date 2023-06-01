package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MethodTaxRateQueryBuilderDsl  {
    public MethodTaxRateQueryBuilderDsl() {
    }

    public static MethodTaxRateQueryBuilderDsl of() {
        return new MethodTaxRateQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MethodTaxRateQueryBuilderDsl> shippingMethodKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodKey")),
        p -> new CombinationQueryPredicate<>(p, MethodTaxRateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MethodTaxRateQueryBuilderDsl> taxRate(
        Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            MethodTaxRateQueryBuilderDsl::of);
    }
    
    
}
