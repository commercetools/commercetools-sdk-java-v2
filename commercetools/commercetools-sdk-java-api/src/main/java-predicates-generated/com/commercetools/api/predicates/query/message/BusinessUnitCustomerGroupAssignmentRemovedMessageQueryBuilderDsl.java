
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl {
    public BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl of() {
        return new BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentRemovedMessageQueryBuilderDsl::of);
    }

}
