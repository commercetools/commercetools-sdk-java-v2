
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderRemoveDiscountCodeActionQueryBuilderDsl {
    public StagedOrderRemoveDiscountCodeActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveDiscountCodeActionQueryBuilderDsl of() {
        return new StagedOrderRemoveDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveDiscountCodeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderRemoveDiscountCodeActionQueryBuilderDsl> discountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountCode"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            StagedOrderRemoveDiscountCodeActionQueryBuilderDsl::of);
    }

}
