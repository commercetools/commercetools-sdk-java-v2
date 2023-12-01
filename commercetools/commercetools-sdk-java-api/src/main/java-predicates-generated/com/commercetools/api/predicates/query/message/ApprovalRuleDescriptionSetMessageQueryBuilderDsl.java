
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleDescriptionSetMessageQueryBuilderDsl {
    public ApprovalRuleDescriptionSetMessageQueryBuilderDsl() {
    }

    public static ApprovalRuleDescriptionSetMessageQueryBuilderDsl of() {
        return new ApprovalRuleDescriptionSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessageQueryBuilderDsl> oldDescription() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldDescription")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessageQueryBuilderDsl::of));
    }

}
