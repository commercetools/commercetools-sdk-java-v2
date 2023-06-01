package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountChangeNameActionQueryBuilderDsl  {
    public CartDiscountChangeNameActionQueryBuilderDsl() {
    }

    public static CartDiscountChangeNameActionQueryBuilderDsl of() {
        return new CartDiscountChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountChangeNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountChangeNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountChangeNameActionQueryBuilderDsl::of);
    }
    
    
}
