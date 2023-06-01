package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountResourceIdentifierQueryBuilderDsl  {
    public CartDiscountResourceIdentifierQueryBuilderDsl() {
    }

    public static CartDiscountResourceIdentifierQueryBuilderDsl of() {
        return new CartDiscountResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartDiscountResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartDiscountResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    
}
