package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetCustomerGroupActionQueryBuilderDsl  {
    public CustomerSetCustomerGroupActionQueryBuilderDsl() {
    }

    public static CustomerSetCustomerGroupActionQueryBuilderDsl of() {
        return new CustomerSetCustomerGroupActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomerGroupActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetCustomerGroupActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerSetCustomerGroupActionQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            CustomerSetCustomerGroupActionQueryBuilderDsl::of);
    }
    
    
}
