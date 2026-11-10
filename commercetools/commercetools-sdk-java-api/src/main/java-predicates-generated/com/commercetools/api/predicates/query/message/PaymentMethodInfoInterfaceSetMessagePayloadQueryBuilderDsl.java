
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl> _interface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl> oldInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

}
