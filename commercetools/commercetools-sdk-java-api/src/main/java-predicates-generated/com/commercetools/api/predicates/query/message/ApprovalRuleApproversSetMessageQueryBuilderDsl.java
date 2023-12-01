
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleApproversSetMessageQueryBuilderDsl {
    public ApprovalRuleApproversSetMessageQueryBuilderDsl() {
    }

    public static ApprovalRuleApproversSetMessageQueryBuilderDsl of() {
        return new ApprovalRuleApproversSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleApproversSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleApproversSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> approvers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleApproversSetMessageQueryBuilderDsl> oldApprovers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldApprovers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl.of())),
            ApprovalRuleApproversSetMessageQueryBuilderDsl::of);
    }

}
