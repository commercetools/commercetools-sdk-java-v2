
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

    public StringComparisonPredicateBuilder<CartsConfigurationQueryBuilderDsl> priceRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartsConfigurationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartsConfigurationQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, CartsConfigurationQueryBuilderDsl::of));
    }

}
