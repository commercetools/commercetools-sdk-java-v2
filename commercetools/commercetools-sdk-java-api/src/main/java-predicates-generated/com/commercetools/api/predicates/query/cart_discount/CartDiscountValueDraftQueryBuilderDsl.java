package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountValueDraftQueryBuilderDsl  {
    public CartDiscountValueDraftQueryBuilderDsl() {
    }

    public static CartDiscountValueDraftQueryBuilderDsl of() {
        return new CartDiscountValueDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountValueDraftQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<CartDiscountValueDraftQueryBuilderDsl> asAbsolute(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueAbsoluteDraftQueryBuilderDsl.of()),
            CartDiscountValueDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountValueDraftQueryBuilderDsl> asFixed(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueFixedDraftQueryBuilderDsl.of()),
            CartDiscountValueDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountValueDraftQueryBuilderDsl> asGiftLineItem(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueGiftLineItemDraftQueryBuilderDsl.of()),
            CartDiscountValueDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CartDiscountValueDraftQueryBuilderDsl> asRelative(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueRelativeDraftQueryBuilderDsl.of()),
            CartDiscountValueDraftQueryBuilderDsl::of);
    }
}
