package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MoneyOverflowErrorQueryBuilderDsl  {
    public MoneyOverflowErrorQueryBuilderDsl() {
    }

    public static MoneyOverflowErrorQueryBuilderDsl of() {
        return new MoneyOverflowErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MoneyOverflowErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, MoneyOverflowErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MoneyOverflowErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, MoneyOverflowErrorQueryBuilderDsl::of));
    }
    
}
