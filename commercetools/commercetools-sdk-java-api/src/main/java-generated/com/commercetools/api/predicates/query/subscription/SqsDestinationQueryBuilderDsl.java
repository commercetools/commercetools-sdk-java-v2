
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class SqsDestinationQueryBuilderDsl {
    public SqsDestinationQueryBuilderDsl() {
    }

    public static SqsDestinationQueryBuilderDsl of() {
        return new SqsDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> accessKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessKey")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> accessSecret() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessSecret")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> queueUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("queueUrl")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> region() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("region")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<SqsDestinationQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, SqsDestinationQueryBuilderDsl::of));
    }
}
