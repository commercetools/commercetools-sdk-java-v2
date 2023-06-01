package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSetLastNameActionQueryBuilderDsl  {
    public MyCustomerSetLastNameActionQueryBuilderDsl() {
    }

    public static MyCustomerSetLastNameActionQueryBuilderDsl of() {
        return new MyCustomerSetLastNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetLastNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetLastNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetLastNameActionQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetLastNameActionQueryBuilderDsl::of));
    }
    
}
