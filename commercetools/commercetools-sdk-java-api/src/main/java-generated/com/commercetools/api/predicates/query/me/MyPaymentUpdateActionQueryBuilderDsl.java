
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentUpdateActionQueryBuilderDsl {
    public MyPaymentUpdateActionQueryBuilderDsl() {
    }

    public static MyPaymentUpdateActionQueryBuilderDsl of() {
        return new MyPaymentUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentUpdateActionQueryBuilderDsl::of));
    }
}
