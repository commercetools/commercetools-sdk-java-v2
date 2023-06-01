package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetLocaleActionQueryBuilderDsl  {
    public StagedOrderSetLocaleActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLocaleActionQueryBuilderDsl of() {
        return new StagedOrderSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetLocaleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetLocaleActionQueryBuilderDsl::of));
    }
    
}
