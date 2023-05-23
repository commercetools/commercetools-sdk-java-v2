
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerAddBillingAddressIdActionQueryBuilderDsl {
    public MyCustomerAddBillingAddressIdActionQueryBuilderDsl() {
    }

    public static MyCustomerAddBillingAddressIdActionQueryBuilderDsl of() {
        return new MyCustomerAddBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerAddBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerAddBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerAddBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

}
