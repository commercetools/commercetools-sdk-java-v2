package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartFreezeCartActionQueryBuilderDsl  {
    public CartFreezeCartActionQueryBuilderDsl() {
    }

    public static CartFreezeCartActionQueryBuilderDsl of() {
        return new CartFreezeCartActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartFreezeCartActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartFreezeCartActionQueryBuilderDsl::of));
    }
    
}
