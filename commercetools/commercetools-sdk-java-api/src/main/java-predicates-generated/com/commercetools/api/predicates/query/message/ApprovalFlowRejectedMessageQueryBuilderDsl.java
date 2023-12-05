
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowRejectedMessageQueryBuilderDsl {
    public ApprovalFlowRejectedMessageQueryBuilderDsl() {
    }

    public static ApprovalFlowRejectedMessageQueryBuilderDsl of() {
        return new ApprovalFlowRejectedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectedMessageQueryBuilderDsl> rejectionReason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rejectionReason")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessageQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessageQueryBuilderDsl::of);
    }

}
