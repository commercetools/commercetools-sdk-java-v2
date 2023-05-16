
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomerSetMessagePayloadQueryBuilderDsl {
    public OrderCustomerSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomerSetMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomerSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomerSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomerSetMessagePayloadQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomerSetMessagePayloadQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomerSetMessagePayloadQueryBuilderDsl> oldCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldCustomer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomerSetMessagePayloadQueryBuilderDsl> oldCustomerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldCustomerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerSetMessagePayloadQueryBuilderDsl::of);
    }

}
