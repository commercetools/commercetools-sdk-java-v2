
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeChangeCartDiscountsActionQueryBuilderDsl {
    public DiscountCodeChangeCartDiscountsActionQueryBuilderDsl() {
    }

    public static DiscountCodeChangeCartDiscountsActionQueryBuilderDsl of() {
        return new DiscountCodeChangeCartDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeChangeCartDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeCartDiscountsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeChangeCartDiscountsActionQueryBuilderDsl> cartDiscounts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("cartDiscounts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl
                            .of())),
            DiscountCodeChangeCartDiscountsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountCodeChangeCartDiscountsActionQueryBuilderDsl> cartDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeCartDiscountsActionQueryBuilderDsl::of));
    }
}
