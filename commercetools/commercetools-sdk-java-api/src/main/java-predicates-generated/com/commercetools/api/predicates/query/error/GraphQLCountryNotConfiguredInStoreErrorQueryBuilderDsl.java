
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl {
    public GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl() {
    }

    public static GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl of() {
        return new GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl> storeCountries() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeCountries")),
            p -> new CombinationQueryPredicate<>(p, GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLCountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }

}
