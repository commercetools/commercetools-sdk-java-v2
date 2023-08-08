
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetDirectDiscountsActionQueryBuilderDsl {
    public StagedOrderSetDirectDiscountsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDirectDiscountsActionQueryBuilderDsl of() {
        return new StagedOrderSetDirectDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDirectDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetDirectDiscountsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetDirectDiscountsActionQueryBuilderDsl> discounts(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discounts"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl.of())),
            StagedOrderSetDirectDiscountsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderSetDirectDiscountsActionQueryBuilderDsl> discounts() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discounts")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetDirectDiscountsActionQueryBuilderDsl::of));
    }

}
