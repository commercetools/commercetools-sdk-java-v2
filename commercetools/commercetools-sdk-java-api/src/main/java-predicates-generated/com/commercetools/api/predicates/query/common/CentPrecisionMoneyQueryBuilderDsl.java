package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CentPrecisionMoneyQueryBuilderDsl  {
    public CentPrecisionMoneyQueryBuilderDsl() {
    }

    public static CentPrecisionMoneyQueryBuilderDsl of() {
        return new CentPrecisionMoneyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CentPrecisionMoneyQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CentPrecisionMoneyQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CentPrecisionMoneyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CentPrecisionMoneyQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyQueryBuilderDsl::of));
    }
    
}
