package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl  {
    public MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl() {
    }

    public static MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl of() {
        return new MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    
}
