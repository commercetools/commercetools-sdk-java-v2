
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl> oldInterfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl::of));
    }

}
