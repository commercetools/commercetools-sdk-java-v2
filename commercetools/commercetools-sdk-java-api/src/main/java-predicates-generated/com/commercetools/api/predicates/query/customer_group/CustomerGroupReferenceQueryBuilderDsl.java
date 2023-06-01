package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupReferenceQueryBuilderDsl  {
    public CustomerGroupReferenceQueryBuilderDsl() {
    }

    public static CustomerGroupReferenceQueryBuilderDsl of() {
        return new CustomerGroupReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerGroupReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerGroupReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupQueryBuilderDsl.of())),
            CustomerGroupReferenceQueryBuilderDsl::of);
    }
    
    
}
