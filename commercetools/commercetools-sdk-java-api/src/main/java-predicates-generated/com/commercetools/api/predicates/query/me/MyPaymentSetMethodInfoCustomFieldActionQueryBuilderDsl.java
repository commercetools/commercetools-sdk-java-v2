
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl {
    public MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

}
