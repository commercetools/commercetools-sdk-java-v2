
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeKeySetMessageQueryBuilderDsl {
    public DiscountCodeKeySetMessageQueryBuilderDsl() {
    }

    public static DiscountCodeKeySetMessageQueryBuilderDsl of() {
        return new DiscountCodeKeySetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeKeySetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountCodeKeySetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeKeySetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountCodeKeySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeKeySetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountCodeKeySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeKeySetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            DiscountCodeKeySetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessageQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessageQueryBuilderDsl::of));
    }

}
