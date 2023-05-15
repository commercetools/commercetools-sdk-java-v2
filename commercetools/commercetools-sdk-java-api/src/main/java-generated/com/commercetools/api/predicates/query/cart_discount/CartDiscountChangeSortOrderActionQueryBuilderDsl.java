
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountChangeSortOrderActionQueryBuilderDsl {
    public CartDiscountChangeSortOrderActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeSortOrderActionQueryBuilderDsl of() {
        return new CartDiscountChangeSortOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeSortOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeSortOrderActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeSortOrderActionQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountChangeSortOrderActionQueryBuilderDsl::of));
    }
}
