
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl {
    public MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl> _interface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interface")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl::of));
    }
}
