
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueQueryBuilderDsl {
    public CartDiscountValueQueryBuilderDsl() {
    }

    public static CartDiscountValueQueryBuilderDsl of() {
        return new CartDiscountValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueQueryBuilderDsl> asAbsolute(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteQueryBuilderDsl.of()),
            CartDiscountValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountValueQueryBuilderDsl> asFixed(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedQueryBuilderDsl.of()),
            CartDiscountValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountValueQueryBuilderDsl> asGiftLineItem(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemQueryBuilderDsl.of()),
            CartDiscountValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountValueQueryBuilderDsl> asRelative(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeQueryBuilderDsl.of()),
            CartDiscountValueQueryBuilderDsl::of);
    }
}
