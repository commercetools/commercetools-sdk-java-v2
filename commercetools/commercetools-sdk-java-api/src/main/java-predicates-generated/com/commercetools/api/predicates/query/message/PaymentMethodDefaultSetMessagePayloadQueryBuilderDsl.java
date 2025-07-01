
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl> _default() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl> oldDefault() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldDefault")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl::of));
    }

}
