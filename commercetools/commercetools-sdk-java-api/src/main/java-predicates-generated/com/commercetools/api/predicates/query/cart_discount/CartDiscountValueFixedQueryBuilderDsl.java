
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueFixedQueryBuilderDsl {
    public CartDiscountValueFixedQueryBuilderDsl() {
    }

    public static CartDiscountValueFixedQueryBuilderDsl of() {
        return new CartDiscountValueFixedQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueFixedQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueFixedQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueFixedQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            CartDiscountValueFixedQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountValueFixedQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueFixedQueryBuilderDsl::of));
    }

}
