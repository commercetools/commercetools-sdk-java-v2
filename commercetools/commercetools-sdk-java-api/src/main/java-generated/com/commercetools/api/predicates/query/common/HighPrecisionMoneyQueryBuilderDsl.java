
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class HighPrecisionMoneyQueryBuilderDsl {
    public HighPrecisionMoneyQueryBuilderDsl() {
    }

    public static HighPrecisionMoneyQueryBuilderDsl of() {
        return new HighPrecisionMoneyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<HighPrecisionMoneyQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
            p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<HighPrecisionMoneyQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
            p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<HighPrecisionMoneyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<HighPrecisionMoneyQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
            p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<HighPrecisionMoneyQueryBuilderDsl> preciseAmount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("preciseAmount")),
            p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyQueryBuilderDsl::of));
    }
}
