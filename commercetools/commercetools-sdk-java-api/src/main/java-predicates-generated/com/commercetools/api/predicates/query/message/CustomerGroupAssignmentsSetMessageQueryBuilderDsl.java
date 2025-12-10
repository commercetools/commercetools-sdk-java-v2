
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentsSetMessageQueryBuilderDsl {
    public CustomerGroupAssignmentsSetMessageQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentsSetMessageQueryBuilderDsl of() {
        return new CustomerGroupAssignmentsSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> oldCustomerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldCustomerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerGroupAssignmentsSetMessageQueryBuilderDsl> oldCustomerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldCustomerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

}
