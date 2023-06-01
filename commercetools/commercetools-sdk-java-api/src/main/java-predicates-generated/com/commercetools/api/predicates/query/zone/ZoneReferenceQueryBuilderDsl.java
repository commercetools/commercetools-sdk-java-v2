package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneReferenceQueryBuilderDsl  {
    public ZoneReferenceQueryBuilderDsl() {
    }

    public static ZoneReferenceQueryBuilderDsl of() {
        return new ZoneReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ZoneReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ZoneReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ZoneReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ZoneReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl.of())),
            ZoneReferenceQueryBuilderDsl::of);
    }
    
    
}
