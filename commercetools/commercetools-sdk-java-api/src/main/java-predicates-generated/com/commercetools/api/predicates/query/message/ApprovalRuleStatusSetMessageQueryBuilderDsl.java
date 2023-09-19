
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleStatusSetMessageQueryBuilderDsl {
    public ApprovalRuleStatusSetMessageQueryBuilderDsl() {
    }

    public static ApprovalRuleStatusSetMessageQueryBuilderDsl of() {
        return new ApprovalRuleStatusSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleStatusSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleStatusSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleStatusSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleStatusSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleStatusSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRuleStatusSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleStatusSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRuleStatusSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessageQueryBuilderDsl> oldStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStatus")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessageQueryBuilderDsl::of));
    }

}
