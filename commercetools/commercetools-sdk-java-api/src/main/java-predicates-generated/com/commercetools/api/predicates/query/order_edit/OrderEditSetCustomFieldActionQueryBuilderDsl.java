package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditSetCustomFieldActionQueryBuilderDsl  {
    public OrderEditSetCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderEditSetCustomFieldActionQueryBuilderDsl of() {
        return new OrderEditSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderEditSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderEditSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
