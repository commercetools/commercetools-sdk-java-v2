
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DirectDiscountDraftQueryBuilderDsl {
    public DirectDiscountDraftQueryBuilderDsl() {
    }

    public static DirectDiscountDraftQueryBuilderDsl of() {
        return new DirectDiscountDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DirectDiscountDraftQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("value"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl.of())),
            DirectDiscountDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DirectDiscountDraftQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl.of())),
            DirectDiscountDraftQueryBuilderDsl::of);
    }

}
