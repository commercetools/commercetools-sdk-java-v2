package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetLocaleActionQueryBuilderDsl  {
    public CustomerSetLocaleActionQueryBuilderDsl() {
    }

    public static CustomerSetLocaleActionQueryBuilderDsl of() {
        return new CustomerSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetLocaleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetLocaleActionQueryBuilderDsl::of));
    }
    
}
