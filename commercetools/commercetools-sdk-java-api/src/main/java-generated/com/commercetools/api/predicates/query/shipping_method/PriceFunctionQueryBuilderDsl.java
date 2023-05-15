
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class PriceFunctionQueryBuilderDsl {
    public PriceFunctionQueryBuilderDsl() {
    }

    public static PriceFunctionQueryBuilderDsl of() {
        return new PriceFunctionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PriceFunctionQueryBuilderDsl> currencyCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencyCode")),
            p -> new CombinationQueryPredicate<>(p, PriceFunctionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PriceFunctionQueryBuilderDsl> function() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("function")),
            p -> new CombinationQueryPredicate<>(p, PriceFunctionQueryBuilderDsl::of));
    }
}
