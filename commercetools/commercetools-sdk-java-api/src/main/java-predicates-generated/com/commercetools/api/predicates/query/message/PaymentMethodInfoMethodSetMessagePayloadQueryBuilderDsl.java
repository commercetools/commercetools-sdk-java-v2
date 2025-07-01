
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl> oldMethod() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldMethod")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl::of));
    }

}
