package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl  {
    public PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl> paymentId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentId")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl> interfaceCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceCode")),
        p -> new CombinationQueryPredicate<>(p, PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
