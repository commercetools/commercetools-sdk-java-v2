
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl {
    public ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl() {
    }

    public static ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl of() {
        return new ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl> releaseExpiredReservations() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("releaseExpiredReservations")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetReleaseExpiredReservationsActionQueryBuilderDsl::of));
    }

}
