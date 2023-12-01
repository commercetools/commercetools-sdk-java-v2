
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRulePredicateSetMessageQueryBuilderDsl {
    public ApprovalRulePredicateSetMessageQueryBuilderDsl() {
    }

    public static ApprovalRulePredicateSetMessageQueryBuilderDsl of() {
        return new ApprovalRulePredicateSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRulePredicateSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRulePredicateSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRulePredicateSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRulePredicateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRulePredicateSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRulePredicateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRulePredicateSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRulePredicateSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessageQueryBuilderDsl> oldPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPredicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessageQueryBuilderDsl::of));
    }

}
