
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentAddedMessageQueryBuilderDsl {
    public CustomerGroupAssignmentAddedMessageQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentAddedMessageQueryBuilderDsl of() {
        return new CustomerGroupAssignmentAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentAddedMessageQueryBuilderDsl> customerGroupAssignment(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customerGroupAssignment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentQueryBuilderDsl.of())),
            CustomerGroupAssignmentAddedMessageQueryBuilderDsl::of);
    }

}
