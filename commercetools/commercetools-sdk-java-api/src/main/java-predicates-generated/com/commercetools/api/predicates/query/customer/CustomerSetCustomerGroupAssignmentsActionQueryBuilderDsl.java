
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl {
    public CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl() {
    }

    public static CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl of() {
        return new CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomerGroupAssignmentsActionQueryBuilderDsl::of));
    }

}
