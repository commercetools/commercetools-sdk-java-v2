
package com.commercetools.api.predicates.query.custom_object;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomObjectQueryBuilderDsl {
    public CustomObjectQueryBuilderDsl() {
    }

    public static CustomObjectQueryBuilderDsl of() {
        return new CustomObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomObjectQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomObjectQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomObjectQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomObjectQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> container() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("container")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomObjectQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectQueryBuilderDsl::of));
    }

}
