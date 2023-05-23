
package com.commercetools.api.predicates.query.review;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReviewSetCustomTypeActionQueryBuilderDsl {
    public ReviewSetCustomTypeActionQueryBuilderDsl() {
    }

    public static ReviewSetCustomTypeActionQueryBuilderDsl of() {
        return new ReviewSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ReviewSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReviewSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ReviewSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReviewSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ReviewSetCustomTypeActionQueryBuilderDsl::of);
    }

}
