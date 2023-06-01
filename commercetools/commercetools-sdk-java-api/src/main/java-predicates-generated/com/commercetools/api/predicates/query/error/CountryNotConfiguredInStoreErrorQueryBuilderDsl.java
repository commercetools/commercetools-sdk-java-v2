package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CountryNotConfiguredInStoreErrorQueryBuilderDsl  {
    public CountryNotConfiguredInStoreErrorQueryBuilderDsl() {
    }

    public static CountryNotConfiguredInStoreErrorQueryBuilderDsl of() {
        return new CountryNotConfiguredInStoreErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CountryNotConfiguredInStoreErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, CountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CountryNotConfiguredInStoreErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, CountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CountryNotConfiguredInStoreErrorQueryBuilderDsl> storeCountries() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeCountries")),
        p -> new CombinationQueryPredicate<>(p, CountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CountryNotConfiguredInStoreErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, CountryNotConfiguredInStoreErrorQueryBuilderDsl::of));
    }
    
}
