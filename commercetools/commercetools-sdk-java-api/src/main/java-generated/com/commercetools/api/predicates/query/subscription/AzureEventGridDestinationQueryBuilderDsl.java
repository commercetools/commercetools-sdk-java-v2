
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class AzureEventGridDestinationQueryBuilderDsl {
    public AzureEventGridDestinationQueryBuilderDsl() {
    }

    public static AzureEventGridDestinationQueryBuilderDsl of() {
        return new AzureEventGridDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AzureEventGridDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AzureEventGridDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AzureEventGridDestinationQueryBuilderDsl> uri() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("uri")),
            p -> new CombinationQueryPredicate<>(p, AzureEventGridDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AzureEventGridDestinationQueryBuilderDsl> accessKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessKey")),
            p -> new CombinationQueryPredicate<>(p, AzureEventGridDestinationQueryBuilderDsl::of));
    }
}
