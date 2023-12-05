
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl> approvers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl> oldApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldApprovers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl::of);
    }

}
