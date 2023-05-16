
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MissingTaxRateForCountryErrorQueryBuilderDsl {
    public MissingTaxRateForCountryErrorQueryBuilderDsl() {
    }

    public static MissingTaxRateForCountryErrorQueryBuilderDsl of() {
        return new MissingTaxRateForCountryErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MissingTaxRateForCountryErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MissingTaxRateForCountryErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MissingTaxRateForCountryErrorQueryBuilderDsl> taxCategoryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCategoryId")),
            p -> new CombinationQueryPredicate<>(p, MissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MissingTaxRateForCountryErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, MissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MissingTaxRateForCountryErrorQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, MissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

}
