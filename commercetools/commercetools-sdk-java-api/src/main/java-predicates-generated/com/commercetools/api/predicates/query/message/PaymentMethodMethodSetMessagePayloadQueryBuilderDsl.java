
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodMethodSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodMethodSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodMethodSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodMethodSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodMethodSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodMethodSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodMethodSetMessagePayloadQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodMethodSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodMethodSetMessagePayloadQueryBuilderDsl> oldMethod() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldMethod")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodMethodSetMessagePayloadQueryBuilderDsl::of));
    }

}
