package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CentPrecisionMoneyDraftQueryBuilderDsl  {
    public CentPrecisionMoneyDraftQueryBuilderDsl() {
    }

    public static CentPrecisionMoneyDraftQueryBuilderDsl of() {
        return new CentPrecisionMoneyDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CentPrecisionMoneyDraftQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CentPrecisionMoneyDraftQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CentPrecisionMoneyDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CentPrecisionMoneyDraftQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
        p -> new CombinationQueryPredicate<>(p, CentPrecisionMoneyDraftQueryBuilderDsl::of));
    }
    
}
