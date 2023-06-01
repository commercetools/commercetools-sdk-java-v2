package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateResourceIdentifierQueryBuilderDsl  {
    public StateResourceIdentifierQueryBuilderDsl() {
    }

    public static StateResourceIdentifierQueryBuilderDsl of() {
        return new StateResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, StateResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StateResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StateResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StateResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StateResourceIdentifierQueryBuilderDsl::of));
    }
    
}
