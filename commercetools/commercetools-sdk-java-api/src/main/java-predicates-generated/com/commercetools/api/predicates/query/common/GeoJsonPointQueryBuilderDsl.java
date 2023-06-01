package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GeoJsonPointQueryBuilderDsl  {
    public GeoJsonPointQueryBuilderDsl() {
    }

    public static GeoJsonPointQueryBuilderDsl of() {
        return new GeoJsonPointQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GeoJsonPointQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, GeoJsonPointQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<GeoJsonPointQueryBuilderDsl> coordinates() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("coordinates")),
        p -> new CombinationQueryPredicate<>(p, GeoJsonPointQueryBuilderDsl::of));
    }
    
}
