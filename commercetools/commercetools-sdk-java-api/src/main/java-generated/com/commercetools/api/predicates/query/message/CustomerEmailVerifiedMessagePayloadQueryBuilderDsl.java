
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerEmailVerifiedMessagePayloadQueryBuilderDsl {
    public CustomerEmailVerifiedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerEmailVerifiedMessagePayloadQueryBuilderDsl of() {
        return new CustomerEmailVerifiedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerEmailVerifiedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailVerifiedMessagePayloadQueryBuilderDsl::of));
    }
}
