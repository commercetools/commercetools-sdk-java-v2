package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreCountriesChangedMessagePayloadQueryBuilderDsl  {
    public StoreCountriesChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreCountriesChangedMessagePayloadQueryBuilderDsl of() {
        return new StoreCountriesChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCountriesChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCountriesChangedMessagePayloadQueryBuilderDsl> addedCountries(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addedCountries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCountriesChangedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCountriesChangedMessagePayloadQueryBuilderDsl> addedCountries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedCountries")),
                p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCountriesChangedMessagePayloadQueryBuilderDsl> removedCountries(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("removedCountries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCountriesChangedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCountriesChangedMessagePayloadQueryBuilderDsl> removedCountries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedCountries")),
                p -> new CombinationQueryPredicate<>(p, StoreCountriesChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
