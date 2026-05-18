
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl {
    public BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl of() {
        return new BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl::of));
    }

}
