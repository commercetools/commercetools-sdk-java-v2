package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GoogleCloudPubSubDestinationQueryBuilderDsl  {
    public GoogleCloudPubSubDestinationQueryBuilderDsl() {
    }

    public static GoogleCloudPubSubDestinationQueryBuilderDsl of() {
        return new GoogleCloudPubSubDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GoogleCloudPubSubDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, GoogleCloudPubSubDestinationQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GoogleCloudPubSubDestinationQueryBuilderDsl> projectId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectId")),
        p -> new CombinationQueryPredicate<>(p, GoogleCloudPubSubDestinationQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GoogleCloudPubSubDestinationQueryBuilderDsl> topic() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("topic")),
        p -> new CombinationQueryPredicate<>(p, GoogleCloudPubSubDestinationQueryBuilderDsl::of));
    }
    
}
