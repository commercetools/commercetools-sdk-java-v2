
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl {
    public PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl> oldInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

}
