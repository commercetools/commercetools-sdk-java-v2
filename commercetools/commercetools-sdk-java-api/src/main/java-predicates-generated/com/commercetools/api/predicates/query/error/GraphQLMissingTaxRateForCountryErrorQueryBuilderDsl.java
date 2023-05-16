
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl {
    public GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl() {
    }

    public static GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl of() {
        return new GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl> taxCategoryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCategoryId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMissingTaxRateForCountryErrorQueryBuilderDsl::of));
    }

}
