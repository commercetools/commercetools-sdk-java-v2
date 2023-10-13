
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetApproversActionQueryBuilderDsl {
    public ApprovalRuleSetApproversActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetApproversActionQueryBuilderDsl of() {
        return new ApprovalRuleSetApproversActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetApproversActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetApproversActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleSetApproversActionQueryBuilderDsl> approvers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("approvers"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl.of())),
            ApprovalRuleSetApproversActionQueryBuilderDsl::of);
    }

}
