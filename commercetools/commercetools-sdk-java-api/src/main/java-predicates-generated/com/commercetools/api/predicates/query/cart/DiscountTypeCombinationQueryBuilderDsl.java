
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountTypeCombinationQueryBuilderDsl {
    public DiscountTypeCombinationQueryBuilderDsl() {
    }

    public static DiscountTypeCombinationQueryBuilderDsl of() {
        return new DiscountTypeCombinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountTypeCombinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountTypeCombinationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountTypeCombinationQueryBuilderDsl> asBestDeal(
            Function<com.commercetools.api.predicates.query.cart.BestDealQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.BestDealQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.BestDealQueryBuilderDsl.of()),
            DiscountTypeCombinationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountTypeCombinationQueryBuilderDsl> asStacking(
            Function<com.commercetools.api.predicates.query.cart.StackingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.StackingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart.StackingQueryBuilderDsl.of()),
            DiscountTypeCombinationQueryBuilderDsl::of);
    }
}
