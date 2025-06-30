
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupQueryBuilderDsl {
    public DiscountGroupQueryBuilderDsl() {
    }

    public static DiscountGroupQueryBuilderDsl of() {
        return new DiscountGroupQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountGroupQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountGroupQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountGroupQueryBuilderDsl::of);
    }

}
