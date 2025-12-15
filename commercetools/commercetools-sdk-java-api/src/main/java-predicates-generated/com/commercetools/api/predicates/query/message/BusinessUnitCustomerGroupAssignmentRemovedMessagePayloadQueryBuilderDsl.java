
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
