package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetLastNameActionQueryBuilderDsl  {
    public CustomerSetLastNameActionQueryBuilderDsl() {
    }

    public static CustomerSetLastNameActionQueryBuilderDsl of() {
        return new CustomerSetLastNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetLastNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetLastNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetLastNameActionQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetLastNameActionQueryBuilderDsl::of));
    }
    
}
