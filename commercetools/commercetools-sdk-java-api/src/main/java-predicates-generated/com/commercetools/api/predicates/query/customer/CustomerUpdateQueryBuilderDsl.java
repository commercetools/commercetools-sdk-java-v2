package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerUpdateQueryBuilderDsl  {
    public CustomerUpdateQueryBuilderDsl() {
    }

    public static CustomerUpdateQueryBuilderDsl of() {
        return new CustomerUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CustomerUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.customer.CustomerUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerUpdateActionQueryBuilderDsl.of())),
            CustomerUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CustomerUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, CustomerUpdateQueryBuilderDsl::of));
    }
    
}
