
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartAddDiscountCodeActionQueryBuilderDsl {
    public CartAddDiscountCodeActionQueryBuilderDsl() {
    }

    public static CartAddDiscountCodeActionQueryBuilderDsl of() {
        return new CartAddDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddDiscountCodeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartAddDiscountCodeActionQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CartAddDiscountCodeActionQueryBuilderDsl::of));
    }

}
