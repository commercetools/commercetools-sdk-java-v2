package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionRemoveProductActionQueryBuilderDsl  {
    public ProductSelectionRemoveProductActionQueryBuilderDsl() {
    }

    public static ProductSelectionRemoveProductActionQueryBuilderDsl of() {
        return new ProductSelectionRemoveProductActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionRemoveProductActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionRemoveProductActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionRemoveProductActionQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            ProductSelectionRemoveProductActionQueryBuilderDsl::of);
    }
    
    
}
