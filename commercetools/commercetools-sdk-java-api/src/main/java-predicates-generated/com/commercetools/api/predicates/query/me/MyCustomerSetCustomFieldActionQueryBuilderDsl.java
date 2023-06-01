package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSetCustomFieldActionQueryBuilderDsl  {
    public MyCustomerSetCustomFieldActionQueryBuilderDsl() {
    }

    public static MyCustomerSetCustomFieldActionQueryBuilderDsl of() {
        return new MyCustomerSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
