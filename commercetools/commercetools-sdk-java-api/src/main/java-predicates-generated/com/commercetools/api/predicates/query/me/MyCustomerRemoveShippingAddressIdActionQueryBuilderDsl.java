package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl  {
    public MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl() {
    }

    public static MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl of() {
        return new MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }
    
}
