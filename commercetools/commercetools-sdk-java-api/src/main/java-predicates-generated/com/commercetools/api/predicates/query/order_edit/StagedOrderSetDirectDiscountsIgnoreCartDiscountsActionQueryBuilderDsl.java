
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl {
    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl of() {
        return new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl> directDiscountsIgnoreCartDiscounts() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("directDiscountsIgnoreCartDiscounts")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionQueryBuilderDsl::of));
    }

}
