
package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

public class ZoneUpdateActionQueryBuilderDsl {
    public ZoneUpdateActionQueryBuilderDsl() {
    }

    public static ZoneUpdateActionQueryBuilderDsl of() {
        return new ZoneUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ZoneUpdateActionQueryBuilderDsl::of));
    }
}
