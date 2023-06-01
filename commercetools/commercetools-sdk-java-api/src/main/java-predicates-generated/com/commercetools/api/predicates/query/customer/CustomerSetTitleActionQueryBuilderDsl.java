package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetTitleActionQueryBuilderDsl  {
    public CustomerSetTitleActionQueryBuilderDsl() {
    }

    public static CustomerSetTitleActionQueryBuilderDsl of() {
        return new CustomerSetTitleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetTitleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetTitleActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetTitleActionQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetTitleActionQueryBuilderDsl::of));
    }
    
}
