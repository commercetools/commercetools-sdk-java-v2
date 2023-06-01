package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreAddCountryActionQueryBuilderDsl  {
    public StoreAddCountryActionQueryBuilderDsl() {
    }

    public static StoreAddCountryActionQueryBuilderDsl of() {
        return new StoreAddCountryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreAddCountryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreAddCountryActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreAddCountryActionQueryBuilderDsl> country(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("country"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreAddCountryActionQueryBuilderDsl::of);
    }
    
    
}
