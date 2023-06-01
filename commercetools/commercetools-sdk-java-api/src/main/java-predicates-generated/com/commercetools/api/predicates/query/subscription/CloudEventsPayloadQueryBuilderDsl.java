package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CloudEventsPayloadQueryBuilderDsl  {
    public CloudEventsPayloadQueryBuilderDsl() {
    }

    public static CloudEventsPayloadQueryBuilderDsl of() {
        return new CloudEventsPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> specversion() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("specversion")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> source() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("source")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> subject() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subject")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> time() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("time")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> sequence() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequence")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> sequencetype() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequencetype")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CloudEventsPayloadQueryBuilderDsl> dataref() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dataref")),
        p -> new CombinationQueryPredicate<>(p, CloudEventsPayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CloudEventsPayloadQueryBuilderDsl> data(
        Function<com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("data"))
            .inner(fn.apply(com.commercetools.api.predicates.query.subscription.DeliveryPayloadQueryBuilderDsl.of())),
            CloudEventsPayloadQueryBuilderDsl::of);
    }
    
    
}
