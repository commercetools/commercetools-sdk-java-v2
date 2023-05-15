
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomerGroupSetMessagePayloadQueryBuilderDsl {
    public OrderCustomerGroupSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomerGroupSetMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomerGroupSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomerGroupSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerGroupSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomerGroupSetMessagePayloadQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerGroupSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomerGroupSetMessagePayloadQueryBuilderDsl> oldCustomerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldCustomerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            OrderCustomerGroupSetMessagePayloadQueryBuilderDsl::of);
    }

}
