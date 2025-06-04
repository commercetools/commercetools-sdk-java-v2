
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl {
    public CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl of() {
        return new CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl> invalidateOlderTokens() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidateOlderTokens")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

}
