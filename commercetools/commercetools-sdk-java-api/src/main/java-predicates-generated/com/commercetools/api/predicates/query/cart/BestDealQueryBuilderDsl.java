
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class BestDealQueryBuilderDsl {
    public BestDealQueryBuilderDsl() {
    }

    public static BestDealQueryBuilderDsl of() {
        return new BestDealQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BestDealQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BestDealQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BestDealQueryBuilderDsl> chosenDiscountType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("chosenDiscountType")),
            p -> new CombinationQueryPredicate<>(p, BestDealQueryBuilderDsl::of));
    }

}
