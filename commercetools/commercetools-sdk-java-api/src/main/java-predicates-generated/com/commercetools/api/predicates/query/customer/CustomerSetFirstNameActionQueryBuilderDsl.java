package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetFirstNameActionQueryBuilderDsl  {
    public CustomerSetFirstNameActionQueryBuilderDsl() {
    }

    public static CustomerSetFirstNameActionQueryBuilderDsl of() {
        return new CustomerSetFirstNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetFirstNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetFirstNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetFirstNameActionQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetFirstNameActionQueryBuilderDsl::of));
    }
    
}
