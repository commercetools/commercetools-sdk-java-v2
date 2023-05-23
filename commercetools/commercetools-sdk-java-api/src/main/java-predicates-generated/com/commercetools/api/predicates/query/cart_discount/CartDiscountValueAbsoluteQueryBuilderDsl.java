
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueAbsoluteQueryBuilderDsl {
    public CartDiscountValueAbsoluteQueryBuilderDsl() {
    }

    public static CartDiscountValueAbsoluteQueryBuilderDsl of() {
        return new CartDiscountValueAbsoluteQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueAbsoluteQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueAbsoluteQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueAbsoluteQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("money"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            CartDiscountValueAbsoluteQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountValueAbsoluteQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueAbsoluteQueryBuilderDsl::of));
    }

}
