
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
