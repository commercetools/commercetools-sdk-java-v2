
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountedLineItemPortionDraftQueryBuilderDsl {
    public DiscountedLineItemPortionDraftQueryBuilderDsl() {
    }

    public static DiscountedLineItemPortionDraftQueryBuilderDsl of() {
        return new DiscountedLineItemPortionDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountedLineItemPortionDraftQueryBuilderDsl> discount(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountedLineItemPortionDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountedLineItemPortionDraftQueryBuilderDsl> discountedAmount(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedAmount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl.of())),
            DiscountedLineItemPortionDraftQueryBuilderDsl::of);
    }

}
