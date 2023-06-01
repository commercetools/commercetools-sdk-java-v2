package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxCategoryAddTaxRateActionQueryBuilderDsl  {
    public TaxCategoryAddTaxRateActionQueryBuilderDsl() {
    }

    public static TaxCategoryAddTaxRateActionQueryBuilderDsl of() {
        return new TaxCategoryAddTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryAddTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TaxCategoryAddTaxRateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TaxCategoryAddTaxRateActionQueryBuilderDsl> taxRate(
        Function<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl.of())),
            TaxCategoryAddTaxRateActionQueryBuilderDsl::of);
    }
    
    
}
