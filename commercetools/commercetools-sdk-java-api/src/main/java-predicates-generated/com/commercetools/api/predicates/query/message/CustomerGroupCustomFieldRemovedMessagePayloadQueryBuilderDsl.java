
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
