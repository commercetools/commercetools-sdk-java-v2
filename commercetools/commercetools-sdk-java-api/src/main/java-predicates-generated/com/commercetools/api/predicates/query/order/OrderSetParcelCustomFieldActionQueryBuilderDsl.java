package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetParcelCustomFieldActionQueryBuilderDsl  {
    public OrderSetParcelCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetParcelCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetParcelCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetParcelCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetParcelCustomFieldActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetParcelCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetParcelCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, OrderSetParcelCustomFieldActionQueryBuilderDsl::of));
    }
    
}
