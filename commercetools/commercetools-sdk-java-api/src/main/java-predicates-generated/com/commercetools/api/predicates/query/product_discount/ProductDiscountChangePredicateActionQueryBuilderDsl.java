package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountChangePredicateActionQueryBuilderDsl  {
    public ProductDiscountChangePredicateActionQueryBuilderDsl() {
    }

    public static ProductDiscountChangePredicateActionQueryBuilderDsl of() {
        return new ProductDiscountChangePredicateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangePredicateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountChangePredicateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductDiscountChangePredicateActionQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountChangePredicateActionQueryBuilderDsl::of));
    }
    
}
