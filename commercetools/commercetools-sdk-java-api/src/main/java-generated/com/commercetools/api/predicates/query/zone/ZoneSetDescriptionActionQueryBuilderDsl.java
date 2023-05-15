
package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

public class ZoneSetDescriptionActionQueryBuilderDsl {
    public ZoneSetDescriptionActionQueryBuilderDsl() {
    }

    public static ZoneSetDescriptionActionQueryBuilderDsl of() {
        return new ZoneSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ZoneSetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneSetDescriptionActionQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ZoneSetDescriptionActionQueryBuilderDsl::of));
    }
}
