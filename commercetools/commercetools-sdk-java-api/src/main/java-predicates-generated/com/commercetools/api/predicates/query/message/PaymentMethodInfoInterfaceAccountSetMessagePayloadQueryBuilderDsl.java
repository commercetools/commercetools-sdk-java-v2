
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl> oldInterfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceAccount")),
            p -> new CombinationQueryPredicate<>(p,
                PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

}
