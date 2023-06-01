package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerResetPasswordQueryBuilderDsl  {
    public MyCustomerResetPasswordQueryBuilderDsl() {
    }

    public static MyCustomerResetPasswordQueryBuilderDsl of() {
        return new MyCustomerResetPasswordQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerResetPasswordQueryBuilderDsl> tokenValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tokenValue")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerResetPasswordQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerResetPasswordQueryBuilderDsl> newPassword() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newPassword")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerResetPasswordQueryBuilderDsl::of));
    }
    
}
