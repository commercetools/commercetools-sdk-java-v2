
package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

public class ZoneChangeNameActionQueryBuilderDsl {
    public ZoneChangeNameActionQueryBuilderDsl() {
    }

    public static ZoneChangeNameActionQueryBuilderDsl of() {
        return new ZoneChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ZoneChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ZoneChangeNameActionQueryBuilderDsl::of));
    }
}
