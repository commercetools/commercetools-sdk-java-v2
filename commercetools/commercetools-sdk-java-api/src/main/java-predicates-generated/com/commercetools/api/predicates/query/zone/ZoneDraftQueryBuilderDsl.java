
package com.commercetools.api.predicates.query.zone;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ZoneDraftQueryBuilderDsl {
    public ZoneDraftQueryBuilderDsl() {
    }

    public static ZoneDraftQueryBuilderDsl of() {
        return new ZoneDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ZoneDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ZoneDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ZoneDraftQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ZoneDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ZoneDraftQueryBuilderDsl> locations(
            Function<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("locations"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl.of())),
            ZoneDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ZoneDraftQueryBuilderDsl> locations() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locations")),
            p -> new CombinationQueryPredicate<>(p, ZoneDraftQueryBuilderDsl::of));
    }

}
