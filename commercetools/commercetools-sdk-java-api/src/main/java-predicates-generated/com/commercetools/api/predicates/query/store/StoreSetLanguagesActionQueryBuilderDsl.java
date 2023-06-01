package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreSetLanguagesActionQueryBuilderDsl  {
    public StoreSetLanguagesActionQueryBuilderDsl() {
    }

    public static StoreSetLanguagesActionQueryBuilderDsl of() {
        return new StoreSetLanguagesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetLanguagesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreSetLanguagesActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<StoreSetLanguagesActionQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
        p -> new CombinationQueryPredicate<>(p, StoreSetLanguagesActionQueryBuilderDsl::of));
    }
    
}
