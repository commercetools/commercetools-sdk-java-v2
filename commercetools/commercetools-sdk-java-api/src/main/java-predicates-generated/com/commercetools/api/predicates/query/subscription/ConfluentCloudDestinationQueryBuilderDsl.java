
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class ConfluentCloudDestinationQueryBuilderDsl {
    public ConfluentCloudDestinationQueryBuilderDsl() {
    }

    public static ConfluentCloudDestinationQueryBuilderDsl of() {
        return new ConfluentCloudDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> bootstrapServer() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("bootstrapServer")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> apiKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("apiKey")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> apiSecret() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("apiSecret")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> acks() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("acks")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> topic() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("topic")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConfluentCloudDestinationQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ConfluentCloudDestinationQueryBuilderDsl::of));
    }

}
