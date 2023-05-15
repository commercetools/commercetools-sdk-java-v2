
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerAddShippingAddressIdActionQueryBuilderDsl {
    public MyCustomerAddShippingAddressIdActionQueryBuilderDsl() {
    }

    public static MyCustomerAddShippingAddressIdActionQueryBuilderDsl of() {
        return new MyCustomerAddShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerAddShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerAddShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerAddShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }
}
