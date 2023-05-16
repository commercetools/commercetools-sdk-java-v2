
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerDeletedMessagePayloadQueryBuilderDsl {
    public CustomerDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerDeletedMessagePayloadQueryBuilderDsl of() {
        return new CustomerDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
