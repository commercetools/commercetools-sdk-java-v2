
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowUpdateActionQueryBuilderDsl {
    public ApprovalFlowUpdateActionQueryBuilderDsl() {
    }

    public static ApprovalFlowUpdateActionQueryBuilderDsl of() {
        return new ApprovalFlowUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowUpdateActionQueryBuilderDsl> asApprove(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApproveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApproveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.approval_flow.ApprovalFlowApproveActionQueryBuilderDsl.of()),
            ApprovalFlowUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowUpdateActionQueryBuilderDsl> asReject(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.approval_flow.ApprovalFlowRejectActionQueryBuilderDsl.of()),
            ApprovalFlowUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomFieldActionQueryBuilderDsl.of()),
            ApprovalFlowUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_flow.ApprovalFlowSetCustomTypeActionQueryBuilderDsl.of()),
            ApprovalFlowUpdateActionQueryBuilderDsl::of);
    }
}
