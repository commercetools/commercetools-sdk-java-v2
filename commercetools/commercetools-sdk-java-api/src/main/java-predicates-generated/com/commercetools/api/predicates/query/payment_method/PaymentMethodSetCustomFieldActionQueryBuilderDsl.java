
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetCustomFieldActionQueryBuilderDsl {
    public PaymentMethodSetCustomFieldActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetCustomFieldActionQueryBuilderDsl of() {
        return new PaymentMethodSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetCustomFieldActionQueryBuilderDsl::of));
    }

}
