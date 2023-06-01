package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionSetKeyActionQueryBuilderDsl  {
    public ProductSelectionSetKeyActionQueryBuilderDsl() {
    }

    public static ProductSelectionSetKeyActionQueryBuilderDsl of() {
        return new ProductSelectionSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSelectionSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionSetKeyActionQueryBuilderDsl::of));
    }
    
}
