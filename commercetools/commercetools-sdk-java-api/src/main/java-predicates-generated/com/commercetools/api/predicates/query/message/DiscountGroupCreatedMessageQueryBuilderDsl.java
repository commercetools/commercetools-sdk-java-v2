
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupCreatedMessageQueryBuilderDsl {
    public DiscountGroupCreatedMessageQueryBuilderDsl() {
    }

    public static DiscountGroupCreatedMessageQueryBuilderDsl of() {
        return new DiscountGroupCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountGroupCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountGroupCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountGroupCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DiscountGroupCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessageQueryBuilderDsl> discountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountGroup"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl.of())),
            DiscountGroupCreatedMessageQueryBuilderDsl::of);
    }

}
