
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl {
    public CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
