package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentResourceIdentifierQueryBuilderDsl  {
    public PaymentResourceIdentifierQueryBuilderDsl() {
    }

    public static PaymentResourceIdentifierQueryBuilderDsl of() {
        return new PaymentResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, PaymentResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, PaymentResourceIdentifierQueryBuilderDsl::of));
    }
    
}
