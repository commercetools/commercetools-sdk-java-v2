
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetValidFromActionQueryBuilderDsl {
    public StandalonePriceSetValidFromActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetValidFromActionQueryBuilderDsl of() {
        return new StandalonePriceSetValidFromActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetValidFromActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidFromActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceSetValidFromActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidFromActionQueryBuilderDsl::of));
    }

}
