
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetRequestersActionQueryBuilderDsl {
    public ApprovalRuleSetRequestersActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetRequestersActionQueryBuilderDsl of() {
        return new ApprovalRuleSetRequestersActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetRequestersActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetRequestersActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleSetRequestersActionQueryBuilderDsl> requesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("requesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl.of())),
            ApprovalRuleSetRequestersActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleSetRequestersActionQueryBuilderDsl> requesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetRequestersActionQueryBuilderDsl::of));
    }

}
