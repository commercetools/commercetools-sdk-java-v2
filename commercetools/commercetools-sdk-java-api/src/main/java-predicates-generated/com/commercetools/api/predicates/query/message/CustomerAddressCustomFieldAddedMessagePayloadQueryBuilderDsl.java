
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl {
    public CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl of() {
        return new CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

}
