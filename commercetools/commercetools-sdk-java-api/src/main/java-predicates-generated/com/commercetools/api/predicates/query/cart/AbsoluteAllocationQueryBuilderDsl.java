
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AbsoluteAllocationQueryBuilderDsl {
    public AbsoluteAllocationQueryBuilderDsl() {
    }

    public static AbsoluteAllocationQueryBuilderDsl of() {
        return new AbsoluteAllocationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AbsoluteAllocationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AbsoluteAllocationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AbsoluteAllocationQueryBuilderDsl> amount(
            Function<com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("amount"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl.of())),
            AbsoluteAllocationQueryBuilderDsl::of);
    }

}
