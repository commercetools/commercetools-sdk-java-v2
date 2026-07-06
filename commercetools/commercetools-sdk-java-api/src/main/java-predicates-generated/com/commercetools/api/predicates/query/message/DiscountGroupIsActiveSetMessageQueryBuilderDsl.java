
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupIsActiveSetMessageQueryBuilderDsl {
    public DiscountGroupIsActiveSetMessageQueryBuilderDsl() {
    }

    public static DiscountGroupIsActiveSetMessageQueryBuilderDsl of() {
        return new DiscountGroupIsActiveSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupIsActiveSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountGroupIsActiveSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupIsActiveSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountGroupIsActiveSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupIsActiveSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountGroupIsActiveSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupIsActiveSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DiscountGroupIsActiveSetMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountGroupIsActiveSetMessageQueryBuilderDsl> oldIsActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldIsActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessageQueryBuilderDsl::of));
    }

}
