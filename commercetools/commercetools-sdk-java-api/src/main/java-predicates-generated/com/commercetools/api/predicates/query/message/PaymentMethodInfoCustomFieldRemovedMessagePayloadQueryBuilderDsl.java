
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
