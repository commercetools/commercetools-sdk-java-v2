
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleDraftQueryBuilderDsl {
    public ApprovalRuleDraftQueryBuilderDsl() {
    }

    public static ApprovalRuleDraftQueryBuilderDsl of() {
        return new ApprovalRuleDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleDraftQueryBuilderDsl> approvers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("approvers"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyDraftQueryBuilderDsl.of())),
            ApprovalRuleDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleDraftQueryBuilderDsl> requesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("requesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterDraftQueryBuilderDsl.of())),
            ApprovalRuleDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleDraftQueryBuilderDsl> requesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDraftQueryBuilderDsl::of));
    }

}
