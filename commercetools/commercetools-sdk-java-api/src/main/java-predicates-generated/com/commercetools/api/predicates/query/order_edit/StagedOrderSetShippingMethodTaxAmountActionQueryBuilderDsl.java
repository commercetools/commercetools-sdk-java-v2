
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl {
    public StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingMethodTaxAmountActionQueryBuilderDsl::of);
    }

}
