
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleUpdateActionQueryBuilderDsl {
    public ApprovalRuleUpdateActionQueryBuilderDsl() {
    }

    public static ApprovalRuleUpdateActionQueryBuilderDsl of() {
        return new ApprovalRuleUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetApproversActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetApproversActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetApproversActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetDescriptionActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetKeyActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetNameActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetPredicate(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetPredicateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetPredicateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetPredicateActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetRequesters(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetRequestersActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetRequestersActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetRequestersActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateActionQueryBuilderDsl> asSetStatus(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.approval_rule.ApprovalRuleSetStatusActionQueryBuilderDsl.of()),
            ApprovalRuleUpdateActionQueryBuilderDsl::of);
    }
}
