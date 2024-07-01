
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl {
    public CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl() {
    }

    public static CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl of() {
        return new CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomerRemoveCustomerGroupAssignmentActionQueryBuilderDsl::of);
    }

}
