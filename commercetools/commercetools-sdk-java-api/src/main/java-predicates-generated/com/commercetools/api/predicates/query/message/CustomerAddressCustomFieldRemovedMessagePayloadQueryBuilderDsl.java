
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
