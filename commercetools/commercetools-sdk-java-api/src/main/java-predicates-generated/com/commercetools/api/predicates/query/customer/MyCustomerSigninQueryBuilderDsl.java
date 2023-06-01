package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSigninQueryBuilderDsl  {
    public MyCustomerSigninQueryBuilderDsl() {
    }

    public static MyCustomerSigninQueryBuilderDsl of() {
        return new MyCustomerSigninQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSigninQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSigninQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSigninQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSigninQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSigninQueryBuilderDsl> activeCartSignInMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("activeCartSignInMode")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSigninQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<MyCustomerSigninQueryBuilderDsl> updateProductData() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updateProductData")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSigninQueryBuilderDsl::of));
    }
    
}
