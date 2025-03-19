
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl {
    public CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl::of);
    }

}
