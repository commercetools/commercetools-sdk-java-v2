
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AbsoluteAllocationDraftQueryBuilderDsl {
    public AbsoluteAllocationDraftQueryBuilderDsl() {
    }

    public static AbsoluteAllocationDraftQueryBuilderDsl of() {
        return new AbsoluteAllocationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AbsoluteAllocationDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AbsoluteAllocationDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AbsoluteAllocationDraftQueryBuilderDsl> amount(
            Function<com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("amount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl.of())),
            AbsoluteAllocationDraftQueryBuilderDsl::of);
    }

}
