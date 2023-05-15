
package com.commercetools.api.predicates.query.common;

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
}
