
package com.commercetools.api.predicates.query.zone;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ZoneQueryBuilderDsl {
    public ZoneQueryBuilderDsl() {
    }

    public static ZoneQueryBuilderDsl of() {
        return new ZoneQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ZoneQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ZoneQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ZoneQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ZoneQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ZoneQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ZoneQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ZoneQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ZoneQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ZoneQueryBuilderDsl> locations(
            Function<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("locations"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl.of())),
            ZoneQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ZoneQueryBuilderDsl> locations() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locations")),
            p -> new CombinationQueryPredicate<>(p, ZoneQueryBuilderDsl::of));
    }
}
