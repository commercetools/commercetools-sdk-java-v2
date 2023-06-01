package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartRecalculateActionQueryBuilderDsl  {
    public CartRecalculateActionQueryBuilderDsl() {
    }

    public static CartRecalculateActionQueryBuilderDsl of() {
        return new CartRecalculateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRecalculateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartRecalculateActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<CartRecalculateActionQueryBuilderDsl> updateProductData() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updateProductData")),
        p -> new CombinationQueryPredicate<>(p, CartRecalculateActionQueryBuilderDsl::of));
    }
    
}
