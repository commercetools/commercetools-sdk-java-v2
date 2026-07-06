
package com.commercetools.api.predicates.query.reservation;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReservationReferenceQueryBuilderDsl {
    public ReservationReferenceQueryBuilderDsl() {
    }

    public static ReservationReferenceQueryBuilderDsl of() {
        return new ReservationReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReservationReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ReservationReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReservationReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReservationReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReservationReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.reservation.ReservationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.reservation.ReservationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("obj"))
                .inner(fn.apply(com.commercetools.api.predicates.query.reservation.ReservationQueryBuilderDsl.of())),
            ReservationReferenceQueryBuilderDsl::of);
    }

}
