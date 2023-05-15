
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl {
    public CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl of() {
        return new CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl> reset() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reset")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl::of));
    }
}
