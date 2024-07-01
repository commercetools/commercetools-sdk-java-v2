
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl {
    public CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of));
    }

}
