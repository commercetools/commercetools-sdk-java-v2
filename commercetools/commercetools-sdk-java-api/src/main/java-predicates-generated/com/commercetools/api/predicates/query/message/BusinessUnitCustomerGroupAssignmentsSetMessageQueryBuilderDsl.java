
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl {
    public BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl() {
    }

    public static BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl of() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> oldCustomerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldCustomerGroupAssignments"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl> oldCustomerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldCustomerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomerGroupAssignmentsSetMessageQueryBuilderDsl::of));
    }

}
