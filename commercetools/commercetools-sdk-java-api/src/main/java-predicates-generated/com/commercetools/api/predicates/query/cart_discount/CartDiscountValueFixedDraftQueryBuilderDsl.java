
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueFixedDraftQueryBuilderDsl {
    public CartDiscountValueFixedDraftQueryBuilderDsl() {
    }

    public static CartDiscountValueFixedDraftQueryBuilderDsl of() {
        return new CartDiscountValueFixedDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueFixedDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueFixedDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueFixedDraftQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartDiscountValueFixedDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountValueFixedDraftQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueFixedDraftQueryBuilderDsl::of));
    }

}
