
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetValidUntilActionQueryBuilderDsl {
    public StandalonePriceSetValidUntilActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetValidUntilActionQueryBuilderDsl of() {
        return new StandalonePriceSetValidUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetValidUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceSetValidUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetValidUntilActionQueryBuilderDsl::of));
    }

}
