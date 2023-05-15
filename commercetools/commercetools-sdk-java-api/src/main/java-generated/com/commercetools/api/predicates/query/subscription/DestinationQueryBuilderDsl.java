
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class DestinationQueryBuilderDsl {
    public DestinationQueryBuilderDsl() {
    }

    public static DestinationQueryBuilderDsl of() {
        return new DestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DestinationQueryBuilderDsl::of));
    }
}
