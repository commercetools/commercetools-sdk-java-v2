package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetLineItemCustomTypeActionQueryBuilderDsl  {
    public MyCartSetLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemCustomTypeActionQueryBuilderDsl of() {
        return new MyCartSetLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomTypeActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartSetLineItemCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyCartSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartSetLineItemCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyCartSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
