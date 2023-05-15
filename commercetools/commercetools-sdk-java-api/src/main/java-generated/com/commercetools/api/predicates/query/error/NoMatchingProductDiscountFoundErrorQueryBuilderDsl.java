
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class NoMatchingProductDiscountFoundErrorQueryBuilderDsl {
    public NoMatchingProductDiscountFoundErrorQueryBuilderDsl() {
    }

    public static NoMatchingProductDiscountFoundErrorQueryBuilderDsl of() {
        return new NoMatchingProductDiscountFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<NoMatchingProductDiscountFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, NoMatchingProductDiscountFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<NoMatchingProductDiscountFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, NoMatchingProductDiscountFoundErrorQueryBuilderDsl::of));
    }
}
