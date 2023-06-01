package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneAddLocationActionQueryBuilderDsl  {
    public ZoneAddLocationActionQueryBuilderDsl() {
    }

    public static ZoneAddLocationActionQueryBuilderDsl of() {
        return new ZoneAddLocationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneAddLocationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ZoneAddLocationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ZoneAddLocationActionQueryBuilderDsl> location(
        Function<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("location"))
            .inner(fn.apply(com.commercetools.api.predicates.query.zone.LocationQueryBuilderDsl.of())),
            ZoneAddLocationActionQueryBuilderDsl::of);
    }
    
    
}
