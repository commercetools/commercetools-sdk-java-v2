
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetDescriptionActionQueryBuilderDsl {
    public CartDiscountSetDescriptionActionQueryBuilderDsl() {
    }

    public static CartDiscountSetDescriptionActionQueryBuilderDsl of() {
        return new CartDiscountSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountSetDescriptionActionQueryBuilderDsl::of);
    }

}
