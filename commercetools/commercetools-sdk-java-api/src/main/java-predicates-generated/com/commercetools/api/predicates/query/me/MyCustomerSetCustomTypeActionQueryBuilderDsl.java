package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSetCustomTypeActionQueryBuilderDsl  {
    public MyCustomerSetCustomTypeActionQueryBuilderDsl() {
    }

    public static MyCustomerSetCustomTypeActionQueryBuilderDsl of() {
        return new MyCustomerSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCustomerSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyCustomerSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCustomerSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyCustomerSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
