package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderRemovePaymentActionQueryBuilderDsl  {
    public StagedOrderRemovePaymentActionQueryBuilderDsl() {
    }

    public static StagedOrderRemovePaymentActionQueryBuilderDsl of() {
        return new StagedOrderRemovePaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemovePaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderRemovePaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderRemovePaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderRemovePaymentActionQueryBuilderDsl::of);
    }
    
    
}
