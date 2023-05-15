
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class AWSLambdaDestinationQueryBuilderDsl {
    public AWSLambdaDestinationQueryBuilderDsl() {
    }

    public static AWSLambdaDestinationQueryBuilderDsl of() {
        return new AWSLambdaDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AWSLambdaDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AWSLambdaDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AWSLambdaDestinationQueryBuilderDsl> arn() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("arn")),
            p -> new CombinationQueryPredicate<>(p, AWSLambdaDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AWSLambdaDestinationQueryBuilderDsl> accessKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessKey")),
            p -> new CombinationQueryPredicate<>(p, AWSLambdaDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AWSLambdaDestinationQueryBuilderDsl> accessSecret() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessSecret")),
            p -> new CombinationQueryPredicate<>(p, AWSLambdaDestinationQueryBuilderDsl::of));
    }
}
