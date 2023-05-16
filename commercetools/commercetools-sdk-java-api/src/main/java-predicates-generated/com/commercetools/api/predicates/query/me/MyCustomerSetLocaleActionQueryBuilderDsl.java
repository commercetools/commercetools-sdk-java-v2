
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetLocaleActionQueryBuilderDsl {
    public MyCustomerSetLocaleActionQueryBuilderDsl() {
    }

    public static MyCustomerSetLocaleActionQueryBuilderDsl of() {
        return new MyCustomerSetLocaleActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetLocaleActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetLocaleActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetLocaleActionQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetLocaleActionQueryBuilderDsl::of));
    }

}
