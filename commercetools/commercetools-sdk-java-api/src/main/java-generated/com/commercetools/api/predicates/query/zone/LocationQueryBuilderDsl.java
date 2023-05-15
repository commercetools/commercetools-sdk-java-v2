
package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

public class LocationQueryBuilderDsl {
    public LocationQueryBuilderDsl() {
    }

    public static LocationQueryBuilderDsl of() {
        return new LocationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LocationQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, LocationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LocationQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, LocationQueryBuilderDsl::of));
    }
}
