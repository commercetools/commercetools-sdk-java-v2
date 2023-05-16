
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class CloudEventsFormatQueryBuilderDsl {
    public CloudEventsFormatQueryBuilderDsl() {
    }

    public static CloudEventsFormatQueryBuilderDsl of() {
        return new CloudEventsFormatQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CloudEventsFormatQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CloudEventsFormatQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CloudEventsFormatQueryBuilderDsl> cloudEventsVersion() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cloudEventsVersion")),
            p -> new CombinationQueryPredicate<>(p, CloudEventsFormatQueryBuilderDsl::of));
    }

}
