
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class OverCapacityErrorQueryBuilderDsl {
    public OverCapacityErrorQueryBuilderDsl() {
    }

    public static OverCapacityErrorQueryBuilderDsl of() {
        return new OverCapacityErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OverCapacityErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, OverCapacityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OverCapacityErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, OverCapacityErrorQueryBuilderDsl::of));
    }

}
