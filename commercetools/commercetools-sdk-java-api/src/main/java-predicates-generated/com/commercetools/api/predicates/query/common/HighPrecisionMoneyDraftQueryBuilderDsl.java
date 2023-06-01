package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class HighPrecisionMoneyDraftQueryBuilderDsl  {
    public HighPrecisionMoneyDraftQueryBuilderDsl() {
    }

    public static HighPrecisionMoneyDraftQueryBuilderDsl of() {
        return new HighPrecisionMoneyDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<HighPrecisionMoneyDraftQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
        p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<HighPrecisionMoneyDraftQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
        p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<HighPrecisionMoneyDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<HighPrecisionMoneyDraftQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
        p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<HighPrecisionMoneyDraftQueryBuilderDsl> preciseAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("preciseAmount")),
        p -> new CombinationQueryPredicate<>(p, HighPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    
}
