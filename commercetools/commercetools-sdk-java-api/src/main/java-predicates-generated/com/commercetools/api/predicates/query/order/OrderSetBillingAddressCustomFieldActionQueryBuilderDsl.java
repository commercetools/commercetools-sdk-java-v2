
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetBillingAddressCustomFieldActionQueryBuilderDsl {
    public OrderSetBillingAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetBillingAddressCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetBillingAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetBillingAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetBillingAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetBillingAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

}
