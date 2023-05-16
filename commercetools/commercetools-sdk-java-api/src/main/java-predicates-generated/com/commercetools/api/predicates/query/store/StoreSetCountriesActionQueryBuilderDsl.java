
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreSetCountriesActionQueryBuilderDsl {
    public StoreSetCountriesActionQueryBuilderDsl() {
    }

    public static StoreSetCountriesActionQueryBuilderDsl of() {
        return new StoreSetCountriesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetCountriesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCountriesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreSetCountriesActionQueryBuilderDsl> countries(
            Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("countries"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreSetCountriesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreSetCountriesActionQueryBuilderDsl> countries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCountriesActionQueryBuilderDsl::of));
    }

}
