
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl {
    public MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl() {
    }

    public static MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl of() {
        return new MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }

}
