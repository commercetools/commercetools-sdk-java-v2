package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class UpdateActionQueryBuilderDsl  {
    public UpdateActionQueryBuilderDsl() {
    }

    public static UpdateActionQueryBuilderDsl of() {
        return new UpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<UpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, UpdateActionQueryBuilderDsl::of));
    }
    
}
