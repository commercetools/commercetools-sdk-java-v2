package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeSetKeyActionQueryBuilderDsl  {
    public ProductTypeSetKeyActionQueryBuilderDsl() {
    }

    public static ProductTypeSetKeyActionQueryBuilderDsl of() {
        return new ProductTypeSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeSetKeyActionQueryBuilderDsl::of));
    }
    
}
