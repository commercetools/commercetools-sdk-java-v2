
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleQueryBuilderDsl {
    public ApprovalRuleQueryBuilderDsl() {
    }

    public static ApprovalRuleQueryBuilderDsl of() {
        return new ApprovalRuleQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleQueryBuilderDsl> approvers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverHierarchyQueryBuilderDsl.of())),
            ApprovalRuleQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleQueryBuilderDsl> requesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("requesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl.of())),
            ApprovalRuleQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleQueryBuilderDsl> requesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            ApprovalRuleQueryBuilderDsl::of);
    }

}
