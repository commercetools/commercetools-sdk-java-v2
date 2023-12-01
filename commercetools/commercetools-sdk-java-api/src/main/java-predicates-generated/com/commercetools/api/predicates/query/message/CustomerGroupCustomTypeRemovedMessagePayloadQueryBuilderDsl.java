
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
