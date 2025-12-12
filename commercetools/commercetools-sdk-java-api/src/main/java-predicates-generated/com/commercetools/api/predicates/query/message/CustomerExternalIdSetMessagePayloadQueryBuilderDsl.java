
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerExternalIdSetMessagePayloadQueryBuilderDsl {
    public CustomerExternalIdSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerExternalIdSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerExternalIdSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerExternalIdSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerExternalIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerExternalIdSetMessagePayloadQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CustomerExternalIdSetMessagePayloadQueryBuilderDsl::of));
    }

}
