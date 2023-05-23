
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetCustomFieldActionQueryBuilderDsl {
    public PaymentSetCustomFieldActionQueryBuilderDsl() {
    }

    public static PaymentSetCustomFieldActionQueryBuilderDsl of() {
        return new PaymentSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetCustomFieldActionQueryBuilderDsl::of));
    }

}
