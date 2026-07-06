
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class AnyOrderQueryBuilderDsl {
    public AnyOrderQueryBuilderDsl() {
    }

    public static AnyOrderQueryBuilderDsl of() {
        return new AnyOrderQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AnyOrderQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AnyOrderQueryBuilderDsl::of));
    }

}
