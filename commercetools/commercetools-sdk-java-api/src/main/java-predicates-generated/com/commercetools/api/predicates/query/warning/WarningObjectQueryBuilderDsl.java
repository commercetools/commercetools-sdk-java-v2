
package com.commercetools.api.predicates.query.warning;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class WarningObjectQueryBuilderDsl {
    public WarningObjectQueryBuilderDsl() {
    }

    public static WarningObjectQueryBuilderDsl of() {
        return new WarningObjectQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<WarningObjectQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, WarningObjectQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<WarningObjectQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, WarningObjectQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<WarningObjectQueryBuilderDsl> asImageProcessingOngoing(
            Function<com.commercetools.api.predicates.query.warning.ImageProcessingOngoingWarningQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.ImageProcessingOngoingWarningQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.warning.ImageProcessingOngoingWarningQueryBuilderDsl.of()),
            WarningObjectQueryBuilderDsl::of);
    }
}
