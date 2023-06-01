package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneUpdateQueryBuilderDsl  {
    public ZoneUpdateQueryBuilderDsl() {
    }

    public static ZoneUpdateQueryBuilderDsl of() {
        return new ZoneUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ZoneUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ZoneUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ZoneUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.zone.ZoneUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.zone.ZoneUpdateActionQueryBuilderDsl.of())),
            ZoneUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ZoneUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ZoneUpdateQueryBuilderDsl::of));
    }
    
}
