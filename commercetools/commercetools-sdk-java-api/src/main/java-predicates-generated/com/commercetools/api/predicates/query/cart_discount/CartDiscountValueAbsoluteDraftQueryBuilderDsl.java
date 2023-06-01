package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountValueAbsoluteDraftQueryBuilderDsl  {
    public CartDiscountValueAbsoluteDraftQueryBuilderDsl() {
    }

    public static CartDiscountValueAbsoluteDraftQueryBuilderDsl of() {
        return new CartDiscountValueAbsoluteDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueAbsoluteDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountValueAbsoluteDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountValueAbsoluteDraftQueryBuilderDsl> money(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("money"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartDiscountValueAbsoluteDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CartDiscountValueAbsoluteDraftQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
                p -> new CombinationQueryPredicate<>(p, CartDiscountValueAbsoluteDraftQueryBuilderDsl::of));
    }
    
}
