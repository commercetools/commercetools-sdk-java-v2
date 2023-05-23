
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypedMoneyQueryBuilderDsl {
    public TypedMoneyQueryBuilderDsl() {
    }

    public static TypedMoneyQueryBuilderDsl of() {
        return new TypedMoneyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<TypedMoneyQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
            p -> new CombinationQueryPredicate<>(p, TypedMoneyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypedMoneyQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
            p -> new CombinationQueryPredicate<>(p, TypedMoneyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypedMoneyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, TypedMoneyQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TypedMoneyQueryBuilderDsl> fractionDigits() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fractionDigits")),
            p -> new CombinationQueryPredicate<>(p, TypedMoneyQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypedMoneyQueryBuilderDsl> asCentPrecision(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of()),
            TypedMoneyQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypedMoneyQueryBuilderDsl> asHighPrecision(
            Function<com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.common.HighPrecisionMoneyQueryBuilderDsl.of()),
            TypedMoneyQueryBuilderDsl::of);
    }
}
