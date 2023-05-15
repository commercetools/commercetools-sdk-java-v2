
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreRemoveCountryActionQueryBuilderDsl {
    public StoreRemoveCountryActionQueryBuilderDsl() {
    }

    public static StoreRemoveCountryActionQueryBuilderDsl of() {
        return new StoreRemoveCountryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRemoveCountryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreRemoveCountryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreRemoveCountryActionQueryBuilderDsl> country(
            Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("country"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreRemoveCountryActionQueryBuilderDsl::of);
    }

}
