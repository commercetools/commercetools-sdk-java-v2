
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCustomerSetSalutationActionQueryBuilderDsl {
    public MyCustomerSetSalutationActionQueryBuilderDsl() {
    }

    public static MyCustomerSetSalutationActionQueryBuilderDsl of() {
        return new MyCustomerSetSalutationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerSetSalutationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetSalutationActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerSetSalutationActionQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerSetSalutationActionQueryBuilderDsl::of));
    }
}
