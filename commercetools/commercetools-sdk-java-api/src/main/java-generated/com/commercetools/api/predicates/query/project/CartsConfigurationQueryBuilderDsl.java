
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class CartsConfigurationQueryBuilderDsl {
    public CartsConfigurationQueryBuilderDsl() {
    }

    public static CartsConfigurationQueryBuilderDsl of() {
        return new CartsConfigurationQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CartsConfigurationQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, CartsConfigurationQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CartsConfigurationQueryBuilderDsl> countryTaxRateFallbackEnabled() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countryTaxRateFallbackEnabled")),
            p -> new CombinationQueryPredicate<>(p, CartsConfigurationQueryBuilderDsl::of));
    }
}
