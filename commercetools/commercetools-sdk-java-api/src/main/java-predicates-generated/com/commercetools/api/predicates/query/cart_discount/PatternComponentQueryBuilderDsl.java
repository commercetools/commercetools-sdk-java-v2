
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PatternComponentQueryBuilderDsl {
    public PatternComponentQueryBuilderDsl() {
    }

    public static PatternComponentQueryBuilderDsl of() {
        return new PatternComponentQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PatternComponentQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PatternComponentQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PatternComponentQueryBuilderDsl> asCountOnCustomLineItemUnits(
            Function<com.commercetools.api.predicates.query.cart_discount.CountOnCustomLineItemUnitsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CountOnCustomLineItemUnitsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CountOnCustomLineItemUnitsQueryBuilderDsl.of()),
            PatternComponentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PatternComponentQueryBuilderDsl> asCountOnLineItemUnits(
            Function<com.commercetools.api.predicates.query.cart_discount.CountOnLineItemUnitsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CountOnLineItemUnitsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart_discount.CountOnLineItemUnitsQueryBuilderDsl.of()),
            PatternComponentQueryBuilderDsl::of);
    }
}
