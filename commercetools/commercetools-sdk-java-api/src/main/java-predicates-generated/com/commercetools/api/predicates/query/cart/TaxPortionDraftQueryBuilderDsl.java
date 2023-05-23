
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxPortionDraftQueryBuilderDsl {
    public TaxPortionDraftQueryBuilderDsl() {
    }

    public static TaxPortionDraftQueryBuilderDsl of() {
        return new TaxPortionDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxPortionDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxPortionDraftQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<TaxPortionDraftQueryBuilderDsl> rate() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rate")),
            p -> new CombinationQueryPredicate<>(p, TaxPortionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxPortionDraftQueryBuilderDsl> amount(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("amount"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxPortionDraftQueryBuilderDsl::of);
    }

}
