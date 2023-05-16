
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerCreatedMessagePayloadQueryBuilderDsl {
    public CustomerCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerCreatedMessagePayloadQueryBuilderDsl of() {
        return new CustomerCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerCreatedMessagePayloadQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl.of())),
            CustomerCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
