
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerLastNameSetMessagePayloadQueryBuilderDsl {
    public CustomerLastNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerLastNameSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerLastNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerLastNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerLastNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerLastNameSetMessagePayloadQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
            p -> new CombinationQueryPredicate<>(p, CustomerLastNameSetMessagePayloadQueryBuilderDsl::of));
    }

}
