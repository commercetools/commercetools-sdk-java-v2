
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl {
    public BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl of() {
        return new BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl::of);
    }

}
