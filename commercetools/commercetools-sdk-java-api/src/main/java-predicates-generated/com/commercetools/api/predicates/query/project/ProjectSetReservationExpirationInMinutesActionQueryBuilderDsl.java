
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl {
    public ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl() {
    }

    public static ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl of() {
        return new ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl> reservationExpirationInMinutes() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reservationExpirationInMinutes")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetReservationExpirationInMinutesActionQueryBuilderDsl::of));
    }

}
