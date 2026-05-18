
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl {
    public BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl of() {
        return new BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            BusinessUnitCustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

}
