package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerRemoveAddressActionQueryBuilderDsl  {
    public MyCustomerRemoveAddressActionQueryBuilderDsl() {
    }

    public static MyCustomerRemoveAddressActionQueryBuilderDsl of() {
        return new MyCustomerRemoveAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerRemoveAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveAddressActionQueryBuilderDsl::of));
    }
    
}
