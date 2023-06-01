package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartRemoveDiscountCodeActionQueryBuilderDsl  {
    public CartRemoveDiscountCodeActionQueryBuilderDsl() {
    }

    public static CartRemoveDiscountCodeActionQueryBuilderDsl of() {
        return new CartRemoveDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartRemoveDiscountCodeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartRemoveDiscountCodeActionQueryBuilderDsl> discountCode(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountCode"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            CartRemoveDiscountCodeActionQueryBuilderDsl::of);
    }
    
    
}
