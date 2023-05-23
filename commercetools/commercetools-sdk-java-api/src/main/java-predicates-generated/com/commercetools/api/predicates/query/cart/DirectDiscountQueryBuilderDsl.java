
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DirectDiscountQueryBuilderDsl {
    public DirectDiscountQueryBuilderDsl() {
    }

    public static DirectDiscountQueryBuilderDsl of() {
        return new DirectDiscountQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DirectDiscountQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DirectDiscountQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DirectDiscountQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl.of())),
            DirectDiscountQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DirectDiscountQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl.of())),
            DirectDiscountQueryBuilderDsl::of);
    }

}
