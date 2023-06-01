package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetMiddleNameActionQueryBuilderDsl  {
    public CustomerSetMiddleNameActionQueryBuilderDsl() {
    }

    public static CustomerSetMiddleNameActionQueryBuilderDsl of() {
        return new CustomerSetMiddleNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetMiddleNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetMiddleNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetMiddleNameActionQueryBuilderDsl> middleName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("middleName")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetMiddleNameActionQueryBuilderDsl::of));
    }
    
}
