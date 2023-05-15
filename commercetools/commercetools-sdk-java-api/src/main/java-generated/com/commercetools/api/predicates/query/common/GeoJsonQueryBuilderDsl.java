
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class GeoJsonQueryBuilderDsl {
    public GeoJsonQueryBuilderDsl() {
    }

    public static GeoJsonQueryBuilderDsl of() {
        return new GeoJsonQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GeoJsonQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, GeoJsonQueryBuilderDsl::of));
    }
}
