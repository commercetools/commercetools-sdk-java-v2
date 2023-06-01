package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DeliveryFormatQueryBuilderDsl  {
    public DeliveryFormatQueryBuilderDsl() {
    }

    public static DeliveryFormatQueryBuilderDsl of() {
        return new DeliveryFormatQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryFormatQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, DeliveryFormatQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<DeliveryFormatQueryBuilderDsl> asCloudEvents(
        Function<com.commercetools.api.predicates.query.subscription.CloudEventsFormatQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.CloudEventsFormatQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.CloudEventsFormatQueryBuilderDsl.of()),
            DeliveryFormatQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DeliveryFormatQueryBuilderDsl> asPlatform(
        Function<com.commercetools.api.predicates.query.subscription.PlatformFormatQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.PlatformFormatQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.subscription.PlatformFormatQueryBuilderDsl.of()),
            DeliveryFormatQueryBuilderDsl::of);
    }
}
