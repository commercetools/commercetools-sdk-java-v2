
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl {
    public PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoCustomFieldActionQueryBuilderDsl::of));
    }

}
