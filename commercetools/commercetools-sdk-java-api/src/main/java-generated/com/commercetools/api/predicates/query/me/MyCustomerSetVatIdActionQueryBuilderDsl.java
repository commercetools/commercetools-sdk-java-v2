
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetVatIdActionQueryBuilderDsl {
    public MyCustomerSetVatIdActionQueryBuilderDsl() {
    }

    public static MyCustomerSetVatIdActionQueryBuilderDsl of() {
        return new MyCustomerSetVatIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetVatIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetVatIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetVatIdActionQueryBuilderDsl> vatId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("vatId")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetVatIdActionQueryBuilderDsl::of));
    }
}
