
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerMessagePayloadQueryBuilderDsl {
    public CustomerMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerMessagePayloadQueryBuilderDsl of() {
        return new CustomerMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerMessagePayloadQueryBuilderDsl::of));
    }

}
