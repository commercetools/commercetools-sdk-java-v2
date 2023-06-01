package com.commercetools.api.predicates.query.store_country;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreCountryQueryBuilderDsl  {
    public StoreCountryQueryBuilderDsl() {
    }

    public static StoreCountryQueryBuilderDsl of() {
        return new StoreCountryQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCountryQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, StoreCountryQueryBuilderDsl::of));
    }
    
}
