package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TrackingDataQueryBuilderDsl  {
    public TrackingDataQueryBuilderDsl() {
    }

    public static TrackingDataQueryBuilderDsl of() {
        return new TrackingDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TrackingDataQueryBuilderDsl> trackingId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("trackingId")),
        p -> new CombinationQueryPredicate<>(p, TrackingDataQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TrackingDataQueryBuilderDsl> carrier() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("carrier")),
        p -> new CombinationQueryPredicate<>(p, TrackingDataQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TrackingDataQueryBuilderDsl> provider() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("provider")),
        p -> new CombinationQueryPredicate<>(p, TrackingDataQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TrackingDataQueryBuilderDsl> providerTransaction() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("providerTransaction")),
        p -> new CombinationQueryPredicate<>(p, TrackingDataQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<TrackingDataQueryBuilderDsl> isReturn() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isReturn")),
        p -> new CombinationQueryPredicate<>(p, TrackingDataQueryBuilderDsl::of));
    }
    
}
