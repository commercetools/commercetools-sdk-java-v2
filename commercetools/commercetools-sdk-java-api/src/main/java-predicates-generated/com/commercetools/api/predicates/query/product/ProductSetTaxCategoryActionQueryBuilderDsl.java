package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetTaxCategoryActionQueryBuilderDsl  {
    public ProductSetTaxCategoryActionQueryBuilderDsl() {
    }

    public static ProductSetTaxCategoryActionQueryBuilderDsl of() {
        return new ProductSetTaxCategoryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetTaxCategoryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetTaxCategoryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetTaxCategoryActionQueryBuilderDsl> taxCategory(
        Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxCategory"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl.of())),
            ProductSetTaxCategoryActionQueryBuilderDsl::of);
    }
    
    
}
