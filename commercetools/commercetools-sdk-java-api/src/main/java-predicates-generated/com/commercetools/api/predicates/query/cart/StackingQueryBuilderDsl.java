
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class StackingQueryBuilderDsl {
    public StackingQueryBuilderDsl() {
    }

    public static StackingQueryBuilderDsl of() {
        return new StackingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StackingQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StackingQueryBuilderDsl::of));
    }

}
