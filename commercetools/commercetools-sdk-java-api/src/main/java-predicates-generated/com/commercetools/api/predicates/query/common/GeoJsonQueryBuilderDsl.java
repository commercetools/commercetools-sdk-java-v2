
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

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

    public CombinationQueryPredicate<GeoJsonQueryBuilderDsl> asPoint(
            Function<com.commercetools.api.predicates.query.common.GeoJsonPointQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.GeoJsonPointQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.common.GeoJsonPointQueryBuilderDsl.of()),
            GeoJsonQueryBuilderDsl::of);
    }
}
