
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
