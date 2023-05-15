
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartRemoveItemShippingAddressActionQueryBuilderDsl {
    public MyCartRemoveItemShippingAddressActionQueryBuilderDsl() {
    }

    public static MyCartRemoveItemShippingAddressActionQueryBuilderDsl of() {
        return new MyCartRemoveItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartRemoveItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartRemoveItemShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }
}
