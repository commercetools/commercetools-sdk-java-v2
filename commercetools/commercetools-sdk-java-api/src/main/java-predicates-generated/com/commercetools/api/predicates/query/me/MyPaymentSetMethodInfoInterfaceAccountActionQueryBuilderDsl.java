
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl {
    public MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl::of));
    }

}
