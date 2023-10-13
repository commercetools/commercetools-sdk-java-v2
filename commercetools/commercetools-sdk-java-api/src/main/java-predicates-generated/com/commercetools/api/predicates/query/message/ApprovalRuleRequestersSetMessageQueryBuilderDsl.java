
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleRequestersSetMessageQueryBuilderDsl {
    public ApprovalRuleRequestersSetMessageQueryBuilderDsl() {
    }

    public static ApprovalRuleRequestersSetMessageQueryBuilderDsl of() {
        return new ApprovalRuleRequestersSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> requesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("requesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> requesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessageQueryBuilderDsl> oldRequesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldRequesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleRequestersSetMessageQueryBuilderDsl> oldRequesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldRequesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessageQueryBuilderDsl::of));
    }

}
