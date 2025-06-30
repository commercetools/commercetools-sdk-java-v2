
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupSortOrderSetMessageQueryBuilderDsl {
    public DiscountGroupSortOrderSetMessageQueryBuilderDsl() {
    }

    public static DiscountGroupSortOrderSetMessageQueryBuilderDsl of() {
        return new DiscountGroupSortOrderSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupSortOrderSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountGroupSortOrderSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupSortOrderSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountGroupSortOrderSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupSortOrderSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountGroupSortOrderSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupSortOrderSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DiscountGroupSortOrderSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupSortOrderSetMessageQueryBuilderDsl> oldSortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldSortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupSortOrderSetMessageQueryBuilderDsl::of));
    }

}
