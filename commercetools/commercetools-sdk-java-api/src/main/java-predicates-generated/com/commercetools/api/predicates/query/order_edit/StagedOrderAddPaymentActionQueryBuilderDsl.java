package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderAddPaymentActionQueryBuilderDsl  {
    public StagedOrderAddPaymentActionQueryBuilderDsl() {
    }

    public static StagedOrderAddPaymentActionQueryBuilderDsl of() {
        return new StagedOrderAddPaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddPaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddPaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddPaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderAddPaymentActionQueryBuilderDsl::of);
    }
    
    
}
