package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneRemoveLocationActionQueryBuilderDsl  {
    public ZoneRemoveLocationActionQueryBuilderDsl() {
    }

    public static ZoneRemoveLocationActionQueryBuilderDsl of() {
        return new ZoneRemoveLocationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneRemoveLocationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ZoneRemoveLocationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ZoneRemoveLocationActionQueryBuilderDsl> location(
        Function<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("location"))
            .inner(fn.apply(com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl.of())),
            ZoneRemoveLocationActionQueryBuilderDsl::of);
    }
    
    
}
