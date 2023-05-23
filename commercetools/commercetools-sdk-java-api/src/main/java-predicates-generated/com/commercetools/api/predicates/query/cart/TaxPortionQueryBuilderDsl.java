
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxPortionQueryBuilderDsl {
    public TaxPortionQueryBuilderDsl() {
    }

    public static TaxPortionQueryBuilderDsl of() {
        return new TaxPortionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxPortionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxPortionQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<TaxPortionQueryBuilderDsl> rate() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rate")),
            p -> new CombinationQueryPredicate<>(p, TaxPortionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxPortionQueryBuilderDsl> amount(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("amount"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TaxPortionQueryBuilderDsl::of);
    }

}
