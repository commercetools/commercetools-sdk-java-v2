package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSetCompanyNameActionQueryBuilderDsl  {
    public MyCustomerSetCompanyNameActionQueryBuilderDsl() {
    }

    public static MyCustomerSetCompanyNameActionQueryBuilderDsl of() {
        return new MyCustomerSetCompanyNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetCompanyNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCompanyNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetCompanyNameActionQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetCompanyNameActionQueryBuilderDsl::of));
    }
    
}
