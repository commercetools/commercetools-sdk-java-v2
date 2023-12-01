
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl {
    public CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl of() {
        return new CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl::of));
    }

}
