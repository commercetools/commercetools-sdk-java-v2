package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountSetValidFromAndUntilActionQueryBuilderDsl  {
    public CartDiscountSetValidFromAndUntilActionQueryBuilderDsl() {
    }

    public static CartDiscountSetValidFromAndUntilActionQueryBuilderDsl of() {
        return new CartDiscountSetValidFromAndUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetValidFromAndUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountSetValidFromAndUntilActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountSetValidFromAndUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountSetValidFromAndUntilActionQueryBuilderDsl::of));
    }
    
}
