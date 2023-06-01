package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetCustomFieldActionQueryBuilderDsl  {
    public OrderSetCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, OrderSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, OrderSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
