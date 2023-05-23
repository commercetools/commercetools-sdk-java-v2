
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeInfoQueryBuilderDsl {
    public DiscountCodeInfoQueryBuilderDsl() {
    }

    public static DiscountCodeInfoQueryBuilderDsl of() {
        return new DiscountCodeInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountCodeInfoQueryBuilderDsl> discountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountCode"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            DiscountCodeInfoQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountCodeInfoQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeInfoQueryBuilderDsl::of));
    }

}
