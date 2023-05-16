
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetMethodInfoMethodActionQueryBuilderDsl {
    public MyPaymentSetMethodInfoMethodActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoMethodActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoMethodActionQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoMethodActionQueryBuilderDsl::of));
    }

}
