
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleCreatedMessageQueryBuilderDsl {
    public ApprovalRuleCreatedMessageQueryBuilderDsl() {
    }

    public static ApprovalRuleCreatedMessageQueryBuilderDsl of() {
        return new ApprovalRuleCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleCreatedMessageQueryBuilderDsl> approvalRule(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvalRule"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl.of())),
            ApprovalRuleCreatedMessageQueryBuilderDsl::of);
    }

}
