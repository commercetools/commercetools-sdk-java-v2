
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl {
    public CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl() {
    }

    public static CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl of() {
        return new CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            CustomerAddCustomerGroupAssignmentActionQueryBuilderDsl::of);
    }

}
