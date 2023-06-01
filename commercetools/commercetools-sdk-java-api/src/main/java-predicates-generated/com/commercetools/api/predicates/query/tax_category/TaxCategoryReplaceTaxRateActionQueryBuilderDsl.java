package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TaxCategoryReplaceTaxRateActionQueryBuilderDsl  {
    public TaxCategoryReplaceTaxRateActionQueryBuilderDsl() {
    }

    public static TaxCategoryReplaceTaxRateActionQueryBuilderDsl of() {
        return new TaxCategoryReplaceTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxCategoryReplaceTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TaxCategoryReplaceTaxRateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TaxCategoryReplaceTaxRateActionQueryBuilderDsl> taxRateId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRateId")),
        p -> new CombinationQueryPredicate<>(p, TaxCategoryReplaceTaxRateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TaxCategoryReplaceTaxRateActionQueryBuilderDsl> taxRateKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRateKey")),
        p -> new CombinationQueryPredicate<>(p, TaxCategoryReplaceTaxRateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TaxCategoryReplaceTaxRateActionQueryBuilderDsl> taxRate(
        Function<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateDraftQueryBuilderDsl.of())),
            TaxCategoryReplaceTaxRateActionQueryBuilderDsl::of);
    }
    
    
}
