
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedLineItemPortionQueryBuilderDsl {
    public DiscountedLineItemPortionQueryBuilderDsl() {
    }

    public static DiscountedLineItemPortionQueryBuilderDsl of() {
        return new DiscountedLineItemPortionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedLineItemPortionQueryBuilderDsl> discount(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountedLineItemPortionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedLineItemPortionQueryBuilderDsl> discountedAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            DiscountedLineItemPortionQueryBuilderDsl::of);
    }

}
