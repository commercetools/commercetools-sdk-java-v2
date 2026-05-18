
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> oldCustomerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldCustomerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl> oldCustomerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldCustomerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl::of));
    }

}
