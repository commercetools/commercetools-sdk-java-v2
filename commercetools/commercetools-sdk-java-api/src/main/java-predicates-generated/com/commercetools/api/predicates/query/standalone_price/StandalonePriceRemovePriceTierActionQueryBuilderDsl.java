
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceRemovePriceTierActionQueryBuilderDsl {
    public StandalonePriceRemovePriceTierActionQueryBuilderDsl() {
    }

    public static StandalonePriceRemovePriceTierActionQueryBuilderDsl of() {
        return new StandalonePriceRemovePriceTierActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceRemovePriceTierActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceRemovePriceTierActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePriceRemovePriceTierActionQueryBuilderDsl> tierMinimumQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tierMinimumQuantity")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceRemovePriceTierActionQueryBuilderDsl::of));
    }

}
