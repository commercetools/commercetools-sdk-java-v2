package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartValueTypeQueryBuilderDsl  {
    public CartValueTypeQueryBuilderDsl() {
    }

    public static CartValueTypeQueryBuilderDsl of() {
        return new CartValueTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartValueTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartValueTypeQueryBuilderDsl::of));
    }
    
}
