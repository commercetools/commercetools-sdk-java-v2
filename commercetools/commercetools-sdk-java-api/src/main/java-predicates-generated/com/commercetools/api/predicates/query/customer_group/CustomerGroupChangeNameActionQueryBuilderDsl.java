package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupChangeNameActionQueryBuilderDsl  {
    public CustomerGroupChangeNameActionQueryBuilderDsl() {
    }

    public static CustomerGroupChangeNameActionQueryBuilderDsl of() {
        return new CustomerGroupChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupChangeNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerGroupChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupChangeNameActionQueryBuilderDsl::of));
    }
    
}
