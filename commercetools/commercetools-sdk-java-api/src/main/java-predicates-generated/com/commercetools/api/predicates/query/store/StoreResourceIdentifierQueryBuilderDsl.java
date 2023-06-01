package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreResourceIdentifierQueryBuilderDsl  {
    public StoreResourceIdentifierQueryBuilderDsl() {
    }

    public static StoreResourceIdentifierQueryBuilderDsl of() {
        return new StoreResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, StoreResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StoreResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StoreResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StoreResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StoreResourceIdentifierQueryBuilderDsl::of));
    }
    
}
