package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneUpdateActionQueryBuilderDsl  {
    public ZoneUpdateActionQueryBuilderDsl() {
    }

    public static ZoneUpdateActionQueryBuilderDsl of() {
        return new ZoneUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ZoneUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ZoneUpdateActionQueryBuilderDsl> asAddLocation(
        Function<com.commercetools.api.predicates.query.zone.ZoneAddLocationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneAddLocationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.zone.ZoneAddLocationActionQueryBuilderDsl.of()),
            ZoneUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ZoneUpdateActionQueryBuilderDsl> asChangeName(
        Function<com.commercetools.api.predicates.query.zone.ZoneChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.zone.ZoneChangeNameActionQueryBuilderDsl.of()),
            ZoneUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ZoneUpdateActionQueryBuilderDsl> asRemoveLocation(
        Function<com.commercetools.api.predicates.query.zone.ZoneRemoveLocationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneRemoveLocationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.zone.ZoneRemoveLocationActionQueryBuilderDsl.of()),
            ZoneUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ZoneUpdateActionQueryBuilderDsl> asSetDescription(
        Function<com.commercetools.api.predicates.query.zone.ZoneSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.zone.ZoneSetDescriptionActionQueryBuilderDsl.of()),
            ZoneUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ZoneUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.zone.ZoneSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.zone.ZoneSetKeyActionQueryBuilderDsl.of()),
            ZoneUpdateActionQueryBuilderDsl::of);
    }
}
