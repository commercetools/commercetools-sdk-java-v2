package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetLocaleActionQueryBuilderDsl  {
    public OrderSetLocaleActionQueryBuilderDsl() {
    }

    public static OrderSetLocaleActionQueryBuilderDsl of() {
        return new OrderSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetLocaleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
        p -> new CombinationQueryPredicate<>(p, OrderSetLocaleActionQueryBuilderDsl::of));
    }
    
}
