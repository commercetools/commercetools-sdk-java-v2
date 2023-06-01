package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypedMoneyDraftQueryBuilderDsl  {
    public TypedMoneyDraftQueryBuilderDsl() {
    }

    public static TypedMoneyDraftQueryBuilderDsl of() {
        return new TypedMoneyDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<TypedMoneyDraftQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
        p -> new CombinationQueryPredicate<>(p, TypedMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypedMoneyDraftQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
        p -> new CombinationQueryPredicate<>(p, TypedMoneyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypedMoneyDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, TypedMoneyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<TypedMoneyDraftQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
        p -> new CombinationQueryPredicate<>(p, TypedMoneyDraftQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<TypedMoneyDraftQueryBuilderDsl> asCentPrecision(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyDraftQueryBuilderDsl.of()),
            TypedMoneyDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<TypedMoneyDraftQueryBuilderDsl> asHighPrecision(
        Function<com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.HighPrecisionMoneyDraftQueryBuilderDsl.of()),
            TypedMoneyDraftQueryBuilderDsl::of);
    }
}
