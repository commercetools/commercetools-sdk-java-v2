package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountTargetQueryBuilderDsl  {
    public CartDiscountTargetQueryBuilderDsl() {
    }

    public static CartDiscountTargetQueryBuilderDsl of() {
        return new CartDiscountTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountTargetQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<CartDiscountTargetQueryBuilderDsl> asCustomLineItems(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountCustomLineItemsTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountCustomLineItemsTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountCustomLineItemsTargetQueryBuilderDsl.of()),
            CartDiscountTargetQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountTargetQueryBuilderDsl> asLineItems(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountLineItemsTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountLineItemsTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountLineItemsTargetQueryBuilderDsl.of()),
            CartDiscountTargetQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountTargetQueryBuilderDsl> asShipping(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountShippingCostTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountShippingCostTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountShippingCostTargetQueryBuilderDsl.of()),
            CartDiscountTargetQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountTargetQueryBuilderDsl> asMultiBuyCustomLineItems(
        Function<com.commercetools.api.predicates.query.cart_discount.MultiBuyCustomLineItemsTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.MultiBuyCustomLineItemsTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.MultiBuyCustomLineItemsTargetQueryBuilderDsl.of()),
            CartDiscountTargetQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountTargetQueryBuilderDsl> asMultiBuyLineItems(
        Function<com.commercetools.api.predicates.query.cart_discount.MultiBuyLineItemsTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.MultiBuyLineItemsTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.MultiBuyLineItemsTargetQueryBuilderDsl.of()),
            CartDiscountTargetQueryBuilderDsl::of);
    }
}
