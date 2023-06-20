
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl {
    public StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl of() {
        return new StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

}
