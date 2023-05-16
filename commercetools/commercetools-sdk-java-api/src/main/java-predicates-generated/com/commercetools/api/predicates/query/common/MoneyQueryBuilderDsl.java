
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MoneyQueryBuilderDsl {
    public MoneyQueryBuilderDsl() {
    }

    public static MoneyQueryBuilderDsl of() {
        return new MoneyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MoneyQueryBuilderDsl> centAmount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("centAmount")),
            p -> new CombinationQueryPredicate<>(p, MoneyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MoneyQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
            p -> new CombinationQueryPredicate<>(p, MoneyQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MoneyQueryBuilderDsl> asTypedMoney(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of()),
            MoneyQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MoneyQueryBuilderDsl> asTypedMoneyDraft(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl.of()),
            MoneyQueryBuilderDsl::of);
    }
}
