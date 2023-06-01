package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AzureServiceBusDestinationQueryBuilderDsl  {
    public AzureServiceBusDestinationQueryBuilderDsl() {
    }

    public static AzureServiceBusDestinationQueryBuilderDsl of() {
        return new AzureServiceBusDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AzureServiceBusDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AzureServiceBusDestinationQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AzureServiceBusDestinationQueryBuilderDsl> connectionString() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("connectionString")),
        p -> new CombinationQueryPredicate<>(p, AzureServiceBusDestinationQueryBuilderDsl::of));
    }
    
}
