
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleCreatedMessagePayloadQueryBuilderDsl {
    public ApprovalRuleCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleCreatedMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessagePayloadQueryBuilderDsl> approvalRule(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvalRule"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
