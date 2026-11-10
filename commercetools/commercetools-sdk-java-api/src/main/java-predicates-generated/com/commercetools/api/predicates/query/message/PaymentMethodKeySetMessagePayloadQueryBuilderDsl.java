
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodKeySetMessagePayloadQueryBuilderDsl {
    public PaymentMethodKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodKeySetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
