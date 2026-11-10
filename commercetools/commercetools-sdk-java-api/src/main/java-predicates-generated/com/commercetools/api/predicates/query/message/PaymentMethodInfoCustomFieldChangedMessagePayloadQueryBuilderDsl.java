
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

}
