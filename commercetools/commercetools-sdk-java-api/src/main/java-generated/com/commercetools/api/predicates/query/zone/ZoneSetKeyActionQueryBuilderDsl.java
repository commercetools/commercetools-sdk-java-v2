
package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

public class ZoneSetKeyActionQueryBuilderDsl {
    public ZoneSetKeyActionQueryBuilderDsl() {
    }

    public static ZoneSetKeyActionQueryBuilderDsl of() {
        return new ZoneSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ZoneSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ZoneSetKeyActionQueryBuilderDsl::of));
    }
}
