package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartResourceIdentifierQueryBuilderDsl  {
    public CartResourceIdentifierQueryBuilderDsl() {
    }

    public static CartResourceIdentifierQueryBuilderDsl of() {
        return new CartResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, CartResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CartResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CartResourceIdentifierQueryBuilderDsl::of));
    }
    
}
