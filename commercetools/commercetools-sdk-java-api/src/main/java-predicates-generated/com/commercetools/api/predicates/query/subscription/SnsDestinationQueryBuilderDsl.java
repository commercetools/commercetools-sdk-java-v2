
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class SnsDestinationQueryBuilderDsl {
    public SnsDestinationQueryBuilderDsl() {
    }

    public static SnsDestinationQueryBuilderDsl of() {
        return new SnsDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SnsDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SnsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SnsDestinationQueryBuilderDsl> accessKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessKey")),
            p -> new CombinationQueryPredicate<>(p, SnsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SnsDestinationQueryBuilderDsl> accessSecret() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessSecret")),
            p -> new CombinationQueryPredicate<>(p, SnsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SnsDestinationQueryBuilderDsl> topicArn() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("topicArn")),
            p -> new CombinationQueryPredicate<>(p, SnsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SnsDestinationQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, SnsDestinationQueryBuilderDsl::of));
    }

}
