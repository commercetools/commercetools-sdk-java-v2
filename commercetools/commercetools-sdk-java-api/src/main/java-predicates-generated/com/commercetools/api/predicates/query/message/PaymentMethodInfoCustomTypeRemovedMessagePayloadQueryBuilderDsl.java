
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
