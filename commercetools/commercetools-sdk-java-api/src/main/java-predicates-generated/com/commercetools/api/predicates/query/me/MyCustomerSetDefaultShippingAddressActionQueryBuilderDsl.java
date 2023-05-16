
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl {
    public MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl() {
    }

    public static MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl of() {
        return new MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }

}
