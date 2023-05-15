
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class MyCustomerEmailVerifyQueryBuilderDsl {
    public MyCustomerEmailVerifyQueryBuilderDsl() {
    }

    public static MyCustomerEmailVerifyQueryBuilderDsl of() {
        return new MyCustomerEmailVerifyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerEmailVerifyQueryBuilderDsl> tokenValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tokenValue")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerEmailVerifyQueryBuilderDsl::of));
    }
}
