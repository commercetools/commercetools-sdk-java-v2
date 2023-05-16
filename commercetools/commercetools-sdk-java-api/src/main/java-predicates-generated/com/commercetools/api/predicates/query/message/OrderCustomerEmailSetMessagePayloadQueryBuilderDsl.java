
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderCustomerEmailSetMessagePayloadQueryBuilderDsl {
    public OrderCustomerEmailSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomerEmailSetMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomerEmailSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessagePayloadQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessagePayloadQueryBuilderDsl> oldEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldEmail")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessagePayloadQueryBuilderDsl::of));
    }

}
