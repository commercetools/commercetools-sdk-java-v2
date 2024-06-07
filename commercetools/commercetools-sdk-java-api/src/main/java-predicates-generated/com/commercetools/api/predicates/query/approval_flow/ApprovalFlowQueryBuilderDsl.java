
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowQueryBuilderDsl {
    public ApprovalFlowQueryBuilderDsl() {
    }

    public static ApprovalFlowQueryBuilderDsl of() {
        return new ApprovalFlowQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalFlowQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> rules(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("rules"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowQueryBuilderDsl> rules() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rules")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> rejection(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("rejection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectionQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> approvals(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApprovalQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApprovalQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvals"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApprovalQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowQueryBuilderDsl> approvals() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvals")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> eligibleApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("eligibleApprovers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowQueryBuilderDsl> eligibleApprovers() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("eligibleApprovers")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> pendingApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("pendingApprovers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowQueryBuilderDsl> pendingApprovers() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("pendingApprovers")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> currentTierPendingApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("currentTierPendingApprovers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowQueryBuilderDsl> currentTierPendingApprovers() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currentTierPendingApprovers")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ApprovalFlowQueryBuilderDsl::of);
    }

}
